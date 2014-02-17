(defproject router "0.0.1"
  :source-paths ["out-clj"]
  :hooks [cljx.hooks]
  :plugins [[lein-cljsbuild "1.0.1-SNAPSHOT"]
            [com.keminglabs/cljx "0.3.2"]
            [lein-pdo "0.1.1"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.reader "0.8.4-SNAPSHOT"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]]
  :main main
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :repl-options {:init (use '[clojure.tools.namespace.repl :only (refresh)])}
  :cljx {:builds [{:source-paths ["src/"]
                   :output-path "out-clj/"
                   :rules :clj}
                  {:source-paths ["src/"]
                   :output-path "out-cljs/"
                   :rules :cljs}]}
  :cljsbuild {:builds
              [#_ {:id "release"
                :source-paths ["out-cljs"]
                :incremental true
                :compiler {:output-to "resources/release/out/main.js"
                           :optimizations :advanced
                           :pretty-print false
                           :output-dir "resources/release/out"
                           }}
               {:id "dev"
                :source-paths ["out-cljs"]
                :incremental true
                :compiler {:output-to "resources/dev/out/main.js"
                           :optimizations :none
                           :pretty-print false
                           :source-map "resources/dev/out/main.js.map"
                           :output-dir "resources/dev/out"
                           }}]})


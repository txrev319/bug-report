(ns app
  (:require [cljs.core.async :as async])
  (:require-macros [macros :refer (silly)]
                   [cljs.core.async.macros :as async]))

(defn init []

  


  (silly {:tag :dog}
         :dog (. js/console log "without-go: woof woof")
         cat (. js/console log "without-go: unrecognized"))

  ;; without-go: woof woof

  (async/go
   (silly {:tag :dog}
          :dog (. js/console log "with-go: woof woof")
          cat (. js/console log "with-go: unrecognized")))

  

  ;; with-go: woof woof
  ;; with-go: unrecognized

)

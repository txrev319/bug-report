(ns macros)


(defmacro silly [object pat1 body1 pat2 body2]
  `(case (:tag ~object)
     ~pat1 ~body1
     ~body2))


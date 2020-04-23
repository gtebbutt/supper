(ns supper.detector
  (:require [cljs.env]))

(defn is-node?
  []
  (= "nodejs" (get-in @cljs.env/*compiler* [:options :closure-defines 'cljs.core/*target*])))

(defmacro cs
  "Produces client or server specific code at compile time."
  [client server]
  (if (is-node?)
    server
    client))

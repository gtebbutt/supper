(ns supper.nodejs
  (:require-macros [supper.detector :as d]))

(defn require
  [s]
  (d/cs
   nil
   ((js* "require") s)))

(defn env
  ([s]
   (env s nil))
  ([s default]
   (d/cs
    nil
    (or (aget (js* "process") "env" s) default))))

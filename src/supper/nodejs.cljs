(ns supper.nodejs
  (:require-macros [supper.detector :as d]))

(defn require
  [s]
  (d/cs
   nil
   ((js* "require") s)))

(defn env
  [s]
  (d/cs
   nil
   (aget (js* "process") "env" s)))

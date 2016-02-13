(ns supper.logging
  (:require-macros [supper.detector :as d])
  (:require [supper.nodejs :as nodejs]))

(def logger (d/cs js/log (nodejs/require "loglevel")))

(defn trace
  [& msg]
  (.trace logger (apply str msg)))

(defn debug
  [& msg]
  (.debug logger (apply str msg)))

(defn info
  [& msg]
  (.info logger (apply str msg)))

(defn warn
  [& msg]
  (.warn logger (apply str msg)))

(defn error
  [& msg]
  (.error logger (apply str msg)))

(defn set-level!
  [level]
  (.setLevel logger level))

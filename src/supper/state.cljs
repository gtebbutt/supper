(ns supper.state
  (:require-macros [supper.detector :as d])
  (:require [cljs.reader]
            [supper.logging :as log]))

(defn get-initial-state
  [id default-state]
  (d/cs
    (try
      (cljs.reader/read-string
        (.-textContent
          (. js/document (getElementById id))))

      (catch js/Object e (log/warn "No initial status provided: " e)
        default-state))

    default-state))

(defn new-state-atom
  [id default-state]
  (atom (get-initial-state id default-state)))

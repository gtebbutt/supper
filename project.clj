(defproject supper "0.2.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :clean-targets ^{:protect false} ;Unprotected to allow deletion of file outside project root
  ["out-client" "out-server" "out-test" "server.js" "client.js"]

  :profiles
  {:default [:cljs-shared]

   :cljs-shared
   {:dependencies [[org.clojure/clojure "1.10.1"]
                   [org.clojure/clojurescript "1.10.597"]]

    :plugins [[lein-cljsbuild "1.1.1"]]

    :cljsbuild
    {:builds [{:id "server"
               :source-paths ["src"]
               :compiler
               {:target :nodejs
                :output-to "server.js"
                :output-dir "out-server"
                :optimizations :simple
                :language-in :ecmascript5
                :language-out :ecmascript5}}

              {:id "client"
               :source-paths ["src"]
               :compiler {:output-to "client.js"
                          :output-dir "out-client"
                          :optimizations :advanced
                          :pretty-print false}}]}}})

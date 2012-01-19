(ns snipsnap.test.core
  (:use [snipsnap.core])
  (:use [clojure.test]))

(deftest clipboard
  ;; grab the current clipboard content
  (let [current-content (get-content)]
    (is (= "Hello World!" (do (set-text! "Hello World!")
                              (get-text))))
    (is (= "Hello World!" (set-text! "foo")))
    ;; restore the content of the
    ;; clipboard to its pre-test state
    (set-content! current-content)))

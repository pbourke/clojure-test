; http://www.facebook.com/careers/puzzles.php#!/careers/puzzles.php?puzzle_id=7
; 
; Facebook's version of FizzBuzz
;
; java -cp clojure.jar clojure.main puzzle1.clj puzzle1.in
(require 'clojure.string)

(defn print-hop [x]
  (dotimes [i x]
    (let [j (inc i)]
       (cond 
         (= 0 (mod j 15)) (println "Hop")
         (= 0 (mod j 3))  (println "Hoppity")
         (= 0 (mod j 5))  (println "Hophop")))))

(print-hop 
  (Integer/parseInt 
    (clojure.string/trim (slurp (first *command-line-args*)))))

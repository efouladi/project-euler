(ns project-euler.core
  (:gen-class))

; Problem 1
(defn mul5or3 [x] (or (= 0 (mod x 3)) (= 0 (mod x 5))))))
(reduce + (filter mul5or3 (range 1 1000)))

; Problem 2
(defn fib [x] (if (< x 3) x (+ (fib (dec x)) (fib (- x 2)))))
(reduce + (filter even? (take-while #(< % 4000000) (map fib (range)))))



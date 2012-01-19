# snipsnap

A Clojure library for accessing the system clipboard via AWT

## Usage

```clojure
(set-text! "Hello Clipboard!") ;; Returns the previous clipboard
                               ;; content if it was a String
                               
(get-text)                     ;; Will return "Hello Clipboard!"

(set-content! content)         ;; Sets the clipboard content
                               ;; to any implementation of
                               ;; java.awt.datatransfer.Transferable
                               
(get-content)                  ;; Will return a java.awt.datatransfer.Transferable
```

## License

Copyright (C) 2012 Caleb Peterson

Distributed under the Eclipse Public License, the same as Clojure.

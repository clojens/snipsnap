# snipsnap

A Clojure library for accessing the system clipboard via AWT

## Getting started

Simply add snipsnap as a dependency to your lein/cake project:

```clojure
[snipsnap "0.1.0"]
```

`snipsnap` is available as a Maven artifact via [Clojars](http://clojars.org/snipsnap).

## Usage

```clojure
(set-text! "Hello Clipboard!") ;; Returns the previous clipboard
                               ;; content if it was a String
                               
(get-text)                     ;; Will return "Hello Clipboard!"

(set-content! transferable)    ;; Sets the clipboard content
                               ;; to any implementation of
                               ;; java.awt.datatransfer.Transferable
                               
(get-content)                  ;; Will return a java.awt.datatransfer.Transferable
```

## License

Copyright (C) 2012 Caleb Peterson

Distributed under the Eclipse Public License, the same as Clojure.

# twenty-four
[![Clojars Project](https://img.shields.io/clojars/v/twenty-four.svg)](https://clojars.org/twenty-four)

Make your terminal programs beautiful with
[twenty-four](https://github.com/youhavethewrong/twenty-four)!  Just
wrap text with twenty-four.core/fg to change the foreground color and
twenty-four.core/bg to change the background color.

## Usage

    (fg "taco" 234 44 19)
    (bg "taco" 102 109 255)
    (fg (bg "taco" 99 255 200) 10 44 209)

## License

Copyright © 2017 ESC

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

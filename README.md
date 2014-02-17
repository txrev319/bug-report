run with:

  lein cljx once; lein pdo cljx auto, cljsbuild auto

  open main.html

  
error:

  output is:

    without-go: woof woof
    with-go: woof woof
    with-go: unrecognized

  expected output is:
    without-go: woof woof
    with-go: woof woof


browsers tested in:

  Firefox 27.0
  Chrome 32.0.1700.107

  
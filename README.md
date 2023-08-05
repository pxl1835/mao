# Notes:

-- `demo.html :`

-- `dragdemo.html file demonstrates :`

    1. Parent - Child html element relationship:
         a. A parent element groups its child(ren) element(s)
             example:
                The "container" <div>(id="container") below
                groups the
                  <div id="header" ...>Drag here to move`</div>`
                  <h1 ...>Draggable Parent-Child/Layered Elements Demo </h1>
                which(<div> + <h1>) intuitively move along as a group with the "container" <div>
                when the "header" <div> is dragged.
                The moving action is done by the javascript on the "container" <div>.
         b. A child element is in front of its parent element by default, not physically part of
            its parent,  which can be thought of as
               'the child element devides/blocks/is inside of its parent'.
               example:
                  If the "container" <div> is a part of the <body> element physically,
                  after moving away the "container" <div> from a spot, it would leave
                  the <body> element a blank/hole where the "container" <div> was,
                  evidently we do not observe the mentioned phenomenon,
                  so concluded that the "container" <div>
                  must be in front of the <body>, not part of the <body> element.

    2.  Some CSS usages. Please see the comments in the <style></style> element below.
    3.  The use of javascript in the <script></script> element to achive dynamic or real time functionalities.

-- `8/2nd/2023 meeting on why such HTML layout/stucture:`

       1.  Demo 1.a above
            a. width % 
                Using the layoutexercises.txt.html file as an example: 
                   When changing the value of the CSS width on 
                   main container <div>(a parent), all its child and grandchild
                   elements' width changes accordingly or as a group.  
            b. show/hide
                 Using the layoutexercises.txt.html file as an example: 
                    When applying css 'display:none' on container 1 <div>(a parent)
                    to hide it, all its child elements will be hidden as a group.    
            c. move 
                  Using the moveelementdemo.html file as an example:
                     Only the <div> with id="container" gets moved by clicking
                     the button Move. When making the <h2> and <h5> as the child
                     elements of the container <div>,  the <h2> & <h5> elements
                     moves as a group when their parent gets moved. 
                     
       2.  Review 1.b above  
       3.  css display inline-block vs flex 

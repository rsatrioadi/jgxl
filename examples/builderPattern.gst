<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="builderPattern">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>515 113 98 18</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>276 248 51 18</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>515 245 69 18</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>743 239 69 18</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>962 233 69 18</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>355 369 112 18</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>465 432 100 18</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>466 482 150 18</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>472 522 103 18</string>
            </attr>
        </node>
        <node id="n9">
            <attr name="layout">
                <string>662 368 105 18</string>
            </attr>
        </node>
        <node id="n10">
            <attr name="layout">
                <string>159 606 154 18</string>
            </attr>
        </node>
        <node id="n11">
            <attr name="layout">
                <string>788 438 130 18</string>
            </attr>
        </node>
        <node id="n12">
            <attr name="layout">
                <string>47 677 123 18</string>
            </attr>
        </node>
        <node id="n13">
            <attr name="layout">
                <string>1021 361 110 18</string>
            </attr>
        </node>
        <node id="n14">
            <attr name="layout">
                <string>950 437 136 18</string>
            </attr>
        </node>
        <node id="n15">
            <attr name="layout">
                <string>320 678 99 18</string>
            </attr>
        </node>
        <node id="n16">
            <attr name="layout">
                <string>251 795 222 18</string>
            </attr>
        </node>
        <node id="n17">
            <attr name="layout">
                <string>107 795 92 18</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>id:Client</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Structure</string>
            </attr>
        </edge>
        <edge from="n0" to="n3">
            <attr name="label">
                <string>hasVariable</string>
            </attr>
        </edge>
        <edge from="n0" to="n2">
            <attr name="label">
                <string>hasVariable</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>hasScript</string>
            </attr>
        </edge>
        <edge from="n0" to="n4">
            <attr name="label">
                <string>hasVariable</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>id:s</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Script</string>
            </attr>
        </edge>
        <edge from="n1" to="n10">
            <attr name="label">
                <string>instantiates</string>
            </attr>
            <attr name="layout">
                <string>500 0 301 257 205 330 236 615 11</string>
            </attr>
        </edge>
        <edge from="n1" to="n5">
            <attr name="label">
                <string>instantiates</string>
            </attr>
        </edge>
        <edge from="n1" to="n12">
            <attr name="label">
                <string>invokes</string>
            </attr>
            <attr name="layout">
                <string>500 0 301 257 94 325 108 686 11</string>
            </attr>
        </edge>
        <edge from="n1" to="n8">
            <attr name="label">
                <string>invokes</string>
            </attr>
            <attr name="layout">
                <string>500 0 302 257 297 569 496 569 524 531 11</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>id:d</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:Variable</string>
            </attr>
        </edge>
        <edge from="n2" to="n5">
            <attr name="label">
                <string>typed</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>id:b</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Variable</string>
            </attr>
        </edge>
        <edge from="n3" to="n9">
            <attr name="label">
                <string>typed</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>id:p</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Variable</string>
            </attr>
        </edge>
        <edge from="n4" to="n13">
            <attr name="label">
                <string>typed</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>id:Director</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Structure</string>
            </attr>
        </edge>
        <edge from="n5" to="n7">
            <attr name="label">
                <string>hasScript</string>
            </attr>
            <attr name="layout">
                <string>689 -3 411 378 407 494 541 491 11</string>
            </attr>
        </edge>
        <edge from="n5" to="n6">
            <attr name="label">
                <string>hasVariable</string>
            </attr>
            <attr name="layout">
                <string>250 -31 431 390 431 441 460 441 11</string>
            </attr>
        </edge>
        <edge from="n5" to="n8">
            <attr name="label">
                <string>hasScript</string>
            </attr>
            <attr name="layout">
                <string>642 -1 411 378 380 533 523 531 11</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>id:builder</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Variable</string>
            </attr>
        </edge>
        <edge from="n6" to="n9">
            <attr name="label">
                <string>typed</string>
            </attr>
            <attr name="layout">
                <string>585 2 515 441 671 440 714 377 11</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>id:newDirector</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:Constructor</string>
            </attr>
        </edge>
        <edge from="n7" to="n9">
            <attr name="label">
                <string>hasParameter</string>
            </attr>
            <attr name="layout">
                <string>393 -3 541 491 695 488 714 377 11</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>id:make</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:Operation</string>
            </attr>
        </edge>
        <edge from="n8" to="n15">
            <attr name="label">
                <string>invokes</string>
            </attr>
            <attr name="layout">
                <string>694 -2 523 531 517 688 369 687 11</string>
            </attr>
        </edge>
        <edge from="n8" to="n16">
            <attr name="label">
                <string>invokes</string>
            </attr>
            <attr name="layout">
                <string>828 4 523 531 554 805 362 804 11</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>id:Builder</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>type:Structure</string>
            </attr>
        </edge>
        <edge from="n9" to="n11">
            <attr name="label">
                <string>hasScript</string>
            </attr>
            <attr name="layout">
                <string>500 0 714 377 828 382 853 447 11</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>id:ConcreteBuilder</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>type:Structure</string>
            </attr>
        </edge>
        <edge from="n10" to="n12">
            <attr name="label">
                <string>hasScript</string>
            </attr>
        </edge>
        <edge from="n10" to="n9">
            <attr name="label">
                <string>specializes</string>
            </attr>
            <attr name="layout">
                <string>623 -2 236 615 752 609 752 578 714 377 11</string>
            </attr>
        </edge>
        <edge from="n10" to="n15">
            <attr name="label">
                <string>hasScript</string>
            </attr>
        </edge>
        <edge from="n10" to="n16">
            <attr name="label">
                <string>hasScript</string>
            </attr>
        </edge>
        <edge from="n10" to="n17">
            <attr name="label">
                <string>hasVariable</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>id:buildStep1</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>type:Operation</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>id:getResult</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>type:Operation</string>
            </attr>
        </edge>
        <edge from="n12" to="n13">
            <attr name="label">
                <string>returnType</string>
            </attr>
            <attr name="layout">
                <string>289 0 108 686 65 938 1163 937 1163 373 1076 370 11</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>id:Product</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>type:Structure</string>
            </attr>
        </edge>
        <edge from="n13" to="n14">
            <attr name="label">
                <string>hasScript</string>
            </attr>
            <attr name="layout">
                <string>388 0 1076 370 1018 446 11</string>
            </attr>
        </edge>
        <edge from="n14" to="n14">
            <attr name="label">
                <string>id:setFeature1</string>
            </attr>
        </edge>
        <edge from="n14" to="n14">
            <attr name="label">
                <string>type:Operation</string>
            </attr>
        </edge>
        <edge from="n15" to="n15">
            <attr name="label">
                <string>id:reset</string>
            </attr>
        </edge>
        <edge from="n15" to="n15">
            <attr name="label">
                <string>type:Operation</string>
            </attr>
        </edge>
        <edge from="n16" to="n16">
            <attr name="label">
                <string>id:ConcreteBuilder_buildStep1</string>
            </attr>
        </edge>
        <edge from="n16" to="n16">
            <attr name="label">
                <string>type:Operation</string>
            </attr>
        </edge>
        <edge from="n16" to="n14">
            <attr name="label">
                <string>invokes</string>
            </attr>
            <attr name="layout">
                <string>351 -4 362 804 408 868 661 868 1018 446 11</string>
            </attr>
        </edge>
        <edge from="n17" to="n17">
            <attr name="label">
                <string>id:result</string>
            </attr>
        </edge>
        <edge from="n17" to="n17">
            <attr name="label">
                <string>type:Variable</string>
            </attr>
        </edge>
        <edge from="n17" to="n13">
            <attr name="label">
                <string>typed</string>
            </attr>
            <attr name="layout">
                <string>133 -1 153 804 159 901 1106 901 1076 370 11</string>
            </attr>
        </edge>
    </graph>
</gxl>

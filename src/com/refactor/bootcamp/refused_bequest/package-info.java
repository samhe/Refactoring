package com.refactor.bootcamp.refused_bequest;

/*
        子类应该继承超类的函数和数据。但如果它们不想或不需要继承，又该怎么办呢？
        它们得到所有礼物，却只从中挑选几样来玩!按传统说法，这就意味着继承体系设计错误。
        你需要为这个子类新建一个兄弟类，再运用
        PushDownMethod(328)和
        PushDownField(329)
        把所有用不到的函数下推给那个兄弟。这样一来，超类就只持有所有子类共享的东西。
        你常常会听到这样的建议：所有超类都应该是抽象（abstract）的。
        既然使用“传统说法”这个略带贬义的词，你就可以猜到，我们不建议你这么做，起码不建议你每次都这么做。
        我们经常利用继承来复用一些行为，并发现这可以很好地应用于日常工作。这也是一种坏味道，我们不否认，但气味通常并不强烈。
        所以我们说：如果RefusedBequest引起困惑和问题，请遵循传统忠告。
        但不必认为你每次都得那么做。十有八九这种坏味道很淡，不值得理睬。
        如果子类复用了超类的行为（实现），却又不愿意支持超类的接口，RefusedBequest的坏味道就会变得浓烈。
        拒绝继承超类的实现，这一点我们不介意；但如果拒绝继承超类的接口，我们不以为然。
        不过即使你不愿意继承接口，也不要胡乱修改继承体系，应该运用
        ReplaceInheritancewithDelegation(352)来达到目的。*/

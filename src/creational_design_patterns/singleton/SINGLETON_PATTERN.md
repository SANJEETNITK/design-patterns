Singleton pattern is a design solution where an application wants to have one and only one instance of any class, in all possible scenarios without any exceptional condition. It has been debated long enough in java community regarding possible approaches to make any class singleton. Still, you will find people not satisfied with any solution you give. They cannot be overruled either. In this post, we will discuss some good approaches and will work towards our best possible effort.

<pre>Table of Contents:

<a href="https://github.com/SANJEETNITK/design-patterns/blob/main/src/creational_design_patterns/singleton/EagerSingleton.java" title="eager initialization">1. Singleton with eager initialization</a>
<a href="https://github.com/SANJEETNITK/design-patterns/blob/main/src/creational_design_patterns/singleton/LazySingleton.java" title="lazy_initialization">2. Singleton with lazy initialization</a>
<a href="https://github.com/SANJEETNITK/design-patterns/blob/main/src/creational_design_patterns/singleton/StaticBlockSingleton.java" title="static_block_initialization">3. Singleton with static block initialization</a>
<a href="https://github.com/SANJEETNITK/design-patterns/blob/main/src/creational_design_patterns/singleton/BillPughSingleton.java" title="bill_pugh_singleton">4. Singleton with bill pugh solution</a>
<a href="https://github.com/SANJEETNITK/design-patterns/blob/main/src/creational_design_patterns/singleton/DemoSingleton.java" title="Demo Singleton">5. Best approach for a singleton class</a>
</pre>

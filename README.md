# HelloSpring
right click on HelloProgram.java and select run as java application.
you will get "spring say hello" in the console.
if you change beans.xml
<!-- Original -->
<beanid="helloWorldService"
    class="com.yiibai.tutorial.spring.helloworld.HelloWorldService">
   <propertyname="helloWorld"ref="springHelloWorld"/>
</bean>
 
<!-- Change to: -->
<beanid="helloWorldService"
    class="com.yiibai.tutorial.spring.helloworld.HelloWorldService">
   <propertyname="helloWorld"ref="strutsHelloWorld"/>
</bean>
you will get "strut say hello" in the console.

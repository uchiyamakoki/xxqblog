# xxqblog
基于ssm的博客练习
问题一：[RMI TCP Connection(4)-127.0.0.1] org.apache.catalina.core.ContainerBase.add....<br>
解决：多方面查询终于找到bug原因，是因为我的tomcat版本是8.5，jdk版本是1.8，版本不兼容，我换了tomcat7.0后编译通过，但是有一个疑问就是我在上一个项目时候同样用的tomcat8.5，jdk是1.8项目没有问题，关于这个问题问一直在研究，初步推测跟某些jar包有关系，
<br>

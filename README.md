> 生活中的空气开关设备，当电路发生短路等情况的时候，空气开关设备就会立刻断开电流，保障用电火灾的发生。Hystrix 框架就是实现了类似于 空气开关设备的作用，在多应用程序上级联依赖过程中，级联依赖的某个组件不可用的时候， 就可以使用 Hystrix  来断开依赖，避免整个系统的不可用。起到服务的保护功能。
**总结: Hystrix 的使用提供了 访问调用远程系统、 服务以及第三方的节点出现的延迟或者故障的容错能力**
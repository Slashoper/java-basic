package com.cyfqz.classloader;

/**
 * java类加载器加载流程
 *
 *  每个类加载器都有他自己的加载目录
 *  双亲委派：一个java类加载进JVM内存的过程：
 *  1.每个加载器对他加载的类都有一个缓存
 *  2.向上委托查找，向下委托加载
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/09/03 15:47
 */
public class ClassLoaderDemo {

    public static void main(String[] args) {


        // App classloder -> ext classloader -> bootstrap classloader
        ClassLoader classLoader = ClassLoaderDemo.class.getClassLoader();
        System.out.println("c1 -> "+ classLoader);
        System.out.println("c1 parent -> " + classLoader.getParent());
        System.out.println("c1 parent parent -> " + classLoader.getParent().getParent());
        System.out.println("str classloader -> " + String.class.getClassLoader());

        System.out.println("Bootstrap ClassLoader加载目录：" + System.getProperty("sun.boot.class.path"));
        // Extention ClassLoader 加载 JAVA_HOME/ext 下 的 jar包，可通过-D java.ext.dirs另行制定
        System.out.println("Extention ClassLoader加载目录: "+ System.getProperty("java.ext.dirs"));
        // App ClassLoader 加载 classpath 下 的 jar包，可通过-D java.class.path另行制定
        System.out.println("AppClassLoader加载目录: "+System.getProperty("java.class.path"));



    }
}

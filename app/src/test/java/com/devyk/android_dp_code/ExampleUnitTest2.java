package com.devyk.android_dp_code;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.devyk.android_dp_code.abstract_factory.DarkThemeFactory;
import com.devyk.android_dp_code.abstract_factory.ThemeButton;
import com.devyk.android_dp_code.abstract_factory.ThemeToolbar;
import com.devyk.android_dp_code.adapter.Volt220;
import com.devyk.android_dp_code.adapter.VoltAdapter;
import com.devyk.android_dp_code.bridge.CoffeeAdditives;
import com.devyk.android_dp_code.bridge.LargeCoffee;
import com.devyk.android_dp_code.bridge.Ordinary;
import com.devyk.android_dp_code.bridge.SmallCoffee;
import com.devyk.android_dp_code.bridge.Sugar;
import com.devyk.android_dp_code.builder.LoginManager;
import com.devyk.android_dp_code.component.Component;
import com.devyk.android_dp_code.component.Composite;
import com.devyk.android_dp_code.component.Leaf;
import com.devyk.android_dp_code.component.test2.Dir;
import com.devyk.android_dp_code.component.test2.File;
import com.devyk.android_dp_code.component.test2.Folder;
import com.devyk.android_dp_code.decorator.Boy;
import com.devyk.android_dp_code.decorator.CheapCloth;
import com.devyk.android_dp_code.decorator.ExpensiveCloth;
import com.devyk.android_dp_code.decorator.Person;
import com.devyk.android_dp_code.decorator.PersonCloth;
import com.devyk.android_dp_code.facade.CameraImpl;
import com.devyk.android_dp_code.facade.ICamera;
import com.devyk.android_dp_code.facade.MobilePhone;
import com.devyk.android_dp_code.facade.Phone;
import com.devyk.android_dp_code.facade.PhoneImpl;
import com.devyk.android_dp_code.factory.FunModuleFactor;
import com.devyk.android_dp_code.factory.IFunctionModule;
import com.devyk.android_dp_code.flyweiget.Ticket;
import com.devyk.android_dp_code.flyweiget.TicketFactory;
import com.devyk.android_dp_code.flyweiget.TrainTicket;
import com.devyk.android_dp_code.iterator.test1.Handler;
import com.devyk.android_dp_code.iterator.test1.HandlerA;
import com.devyk.android_dp_code.iterator.test1.HandlerB;
import com.devyk.android_dp_code.iterator.test1.HandlerRequest;
import com.devyk.android_dp_code.iterator.test1.RequestA;
import com.devyk.android_dp_code.iterator.test1.RequestB;
import com.devyk.android_dp_code.iterator_.Aggregate;
import com.devyk.android_dp_code.iterator_.ConcreteAggregate;
import com.devyk.android_dp_code.iterator_.Iterator;
import com.devyk.android_dp_code.mediator.test1.ConcreteColleagueA;
import com.devyk.android_dp_code.mediator.test1.ConcreteColleagueB;
import com.devyk.android_dp_code.mediator.test1.ConcreteMediator;
import com.devyk.android_dp_code.mediator.test2.CDDevice;
import com.devyk.android_dp_code.mediator.test2.CPU;
import com.devyk.android_dp_code.mediator.test2.GraphicsCard;
import com.devyk.android_dp_code.mediator.test2.MainBoard;
import com.devyk.android_dp_code.mediator.test2.SoundCard;
import com.devyk.android_dp_code.observer.Coder;
import com.devyk.android_dp_code.observer.JueJ;
import com.devyk.android_dp_code.prototype.WordDocument;
import com.devyk.android_dp_code.proxy.test1.ILawsuit;
import com.devyk.android_dp_code.proxy.test1.ProxyLawyer;
import com.devyk.android_dp_code.proxy.test1.XProgrammer;
import com.devyk.android_dp_code.proxy.test1.test2.DynamicProxy;
import com.devyk.android_dp_code.strategy.LuxuryCar;
import com.devyk.android_dp_code.strategy.MediumCar;
import com.devyk.android_dp_code.strategy.TransportationCalculator;
import com.devyk.android_dp_code.template.AbstractComputer;
import com.devyk.android_dp_code.template.CoderComputer;
import com.devyk.android_dp_code.template.MilitaryComputer;
import com.devyk.android_dp_code.visitor.BusinesssReport;
import com.devyk.android_dp_code.visitor.CEOVisitor;
import com.devyk.android_dp_code.visitor.CTOVisitor;

import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-08-30 15:14
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ExampleUnitTest2
 * </pre>
 */
public class ExampleUnitTest2 {

    private Object obj1 = new Object();
    private Object obj2 = new Object();


    @Test
    public void mian() {
        Person p1 = new Person("yangkun", 28);
        Person p2 = new Person("yangkun", 28);
        Person p3 = new Person("yangkun2", 28);
        Person p4 = new Person("yangkun3", 28);
        Person p5 = new Person("yangkun4", 28);


        HashSet<Person> h1 = new HashSet<>();
        h1.add(p1);
        h1.add(p2);
        h1.add(p3);
        h1.add(p4);
        h1.add(p5);
        System.out.println("p1 == p2 ? " + (p1 == p2));
        System.out.println("p1 == p2 ? " + (p1.equals(p2)));
        System.out.println("h1 " + h1);


    }

    /**
     * @desc Person类。
     */
    private static class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " - " + age;
        }

//        @Override
//        public int hashCode() {
//            return name.hashCode() + new Integer(age).hashCode();
//        }

        /**
         * 37          * @desc 覆盖equals方法
         * 38
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            //如果是同一个对象返回true，反之返回false
            if (this == obj) {
                return true;
            }

            //判断是否类型相同
            if (this.getClass() != obj.getClass()) {
                return false;
            }

            Person person = (Person) obj;
            return name.equals(person.name) && age == person.age;
        }
    }

    @Test
    public void test2() {

        LoginManager loginManager = new LoginManager.Builder()
                .isAutoLogin(true)
                .isBootLauncher(true)
                .isCrashOnRestart(true)
                .isSavePwd(true)
                .build();

        System.out.printf("loginManager:" + loginManager.toString());

    }

    @Test
    public void hashMapTest() {

    }

    private void showAlertDialog(Context context) {
        new AlertDialog.Builder(context)
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("测试数据")
                .setTitle("提示")
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setNegativeButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).create()//最后一步就是在 Builder 中构建出 AlerDialog 对象，并初始化数据
                .show(); // 显示

    }

    @Test
    public void test4() {
        //1. 构建文档对象
        WordDocument wordDocument = new WordDocument();
        //2. 编辑文档
        wordDocument.setmTxt("今天是一个好天气");
        wordDocument.addImagepath("/sdcard/image.png");
        wordDocument.addImagepath("/sdcard/image2.png");
        wordDocument.addImagepath("/sdcard/image3.png");
        //打印文档内容
        wordDocument.println();


        System.out.println("--------------------开始clone-----\n\n");

        //以原始文档为准，copy 副本
        WordDocument cloneDoc = wordDocument.clone();

        System.out.println(" 打印副本，看看数据  \n\n");
        //打印副本，看看数据
        cloneDoc.println();

        //在副本文档上修改
        cloneDoc.setmTxt("副奔上修改文档：老龙王哭了");
        cloneDoc.addImagepath("/sdcard/副本发生改变");
        System.out.println("  打印修改后的副本  \n\n");
        //打印修改后的副本
        cloneDoc.println();
        System.out.println("----看会不会影响原始文档-----\n\n");
        //看会不会影响原始文档？？？？？？？
        wordDocument.println();

        System.out.println("内存地址：\nwordDocument: " + wordDocument.toString() + "\n" + "cloneDoc: " + cloneDoc.toString());

    }

    @Test
    public void test5() {
        new Thread("线程 1 ") {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("Thread: " + getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj2) {
                        System.out.printf("Thread: " + getName() + "---> synchronized");
                    }

                }

            }
        }.start();

        new Thread("线程 2 ") {
            @Override
            public void run() {
                synchronized (obj2) {
                    System.out.println("Thread: " + getName() + "---> 进入线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + getName() + "-----> waiting");

                    synchronized (obj1) {
                        System.out.println("Thread: " + getName() + "---> synchronized");
                    }
                }

            }
        }.start();
    }

    @Test
    public void test6() {
        Integer i11 = 333;
        Integer i22 = 333;
        System.out.println(i11 == i22);// 输出 false
        System.out.println(i11.equals(i22));// 输出 false
        Integer i33 = 127;
        Integer i44 = 127;
        System.out.println(i33 == i44);// 输出 true


        Integer i55 = 128;
        Integer i66 = 128;
        System.out.println(i55 == i66);// 输出 true
    }


    @Test
    public void test7() {

        FunModuleFactor funModuleFactor = new FunModuleFactor();
        List<IFunctionModule> vip = funModuleFactor.getMoudleFun("VIP");
        System.out.println("VIP:" + vip.size());


        List<IFunctionModule> kip = funModuleFactor.getMoudleFun("KIP");
        System.out.println("KIP:" + kip.size());

    }

    @Test
    public void testAbstractFactory() {
        DarkThemeFactory darkThemeFactory = new DarkThemeFactory(null);
        //创建暗色主题按钮
        ThemeButton button = darkThemeFactory.createButton();
        //创建亮色主题标题栏
        ThemeToolbar toolbar = darkThemeFactory.createToolbar();
    }

    @Test
    public void test8() {
        TransportationCalculator transportationCalculator = new TransportationCalculator();
        System.out.println("普通车 1 km RMB:" + transportationCalculator.calcu(5));


        transportationCalculator.setStrategy(new MediumCar());
        System.out.println("中级车 1 km RMB:" + transportationCalculator.calcu(5));


        transportationCalculator.setStrategy(new LuxuryCar());
        System.out.println("豪华车 1 km RMB:" + transportationCalculator.calcu(5));
    }


    /**
     * 客户处理
     */
    @Test
    public void testIterator() {
        //构造处理对象
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();

        //交给下一个节点处理
        handlerA.nextHandler = handlerB;

        //构造请求对象
        HandlerRequest handlerRequestA = new RequestA("A");
        HandlerRequest handlerRequestB = new RequestB("B");

        //发起请求
        handlerA.handlerRequest(handlerRequestA);
        handlerA.handlerRequest(handlerRequestB);

    }


    @Test
    public void testObserver() {
        //创建被观察者--》技术网站
        JueJ jueJ = new JueJ();

        //创建观察者
        Coder coderA = new Coder("A");
        Coder coderB = new Coder("B");
        Coder coderC = new Coder("C");

        //产生订阅关系，加入被观察者列表中，有更新就推送给它们
        jueJ.addObserver(coderA);
        jueJ.addObserver(coderB);
        jueJ.addObserver(coderC);

        //有更新了，通知观察者们
        jueJ.post("Dev_YK: 更新了一篇设计模式文章，点击进行查看。");
    }

    @Test
    public void testIterators() {

        //创建容器
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");

        //拿到容器迭代器，使用迭代器遍历
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println("Aggregate: " + iterator.next());
        }

    }

    @Test
    public void testTemplate() {

        AbstractComputer abstractComputerA = new CoderComputer();
        abstractComputerA.startUp();

        AbstractComputer abstractComputerB = new MilitaryComputer();
        abstractComputerB.startUp();
    }

    @Test
    public void textVisitor() {
        //构建报表
        BusinesssReport businesssReport = new BusinesssReport();
        //给 CEO 汇报的报表
        System.out.println(">>>>>>>给 CEO 汇报的报表");
        businesssReport.showReport(new CEOVisitor());
        //给 CTO 汇报的报表
        System.out.println(">>>>>>>给 CTO 汇报的报表");
        businesssReport.showReport(new CTOVisitor());
    }

    @Test
    public void testMediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.setConcreteColleagueA(new ConcreteColleagueA(mediator));
        mediator.setConcreteColleagueB(new ConcreteColleagueB(mediator));
        mediator.method();
    }

    @Test
    public void testMediator2() {

        //构造主板对象--也就是中介者
        MainBoard mainBoard = new MainBoard();
        //分别构造零部件
        CPU cpu = new CPU(mainBoard);

        CDDevice cdDevice = new CDDevice(mainBoard);

        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);

        SoundCard soundCard = new SoundCard(mainBoard);

        //将各个零部件安装到主板身上
        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCPU(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);

        //安装完成后，开始播放视频。
        cdDevice.load();


    }

    @Test
    public void testProxy() {

        //X 程序员
        ILawsuit lawsuit = new XProgrammer();

        //程序员请的律师，把自己的事务交于律师来处理
        ILawsuit proxyLawyer = new ProxyLawyer(lawsuit);

        //律师开始处理
        proxyLawyer.submit();
        proxyLawyer.burden();
        proxyLawyer.defend();
        proxyLawyer.finish();
    }

    @Test
    public void testDynamicProxy() {

        //X 程序员
        ILawsuit lawsuit = new XProgrammer();

        //构造一个动态代理对象（程序员请的律师，把自己的事务交于律师来处理）
        DynamicProxy dynamicProxy = new DynamicProxy(lawsuit);

        //拿到代理者身上的 ClassLoader
        ClassLoader classLoader = lawsuit.getClass().getClassLoader();

        //动态的构造一个代理者律师出来
        ILawsuit proxyLawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, dynamicProxy);

        //律师开始处理
        proxyLawyer.submit();
        proxyLawyer.burden();
        proxyLawyer.defend();
        proxyLawyer.finish();
    }

    @Test
    public void testComponent() {
        //构造一个根节点
        Component root = new Composite("Root");

        //构造枝干节点
        Component branchA = new Composite("branchA");
        Component branchB = new Composite("branchB");

        //构造叶子节点
        Component leafA = new Leaf("leafA");
        Component leafB = new Leaf("LeafB");

        //将叶子节点添加至枝干节点中
        branchA.addChild(leafA);
        branchB.addChild(leafB);

        //将枝干节点添加进跟节点
        root.addChild(branchA);
        root.addChild(branchB);

        root.doSomething();
    }


    @Test
    public void testComponent2(){
        //构造一个目录对象表示 sdcard 盘跟目录
        Dir diskSdcard = new Folder("sdcard");

        // sdcard 下有一个文件
        diskSdcard.addDir(new File("bug.log"));

        //sdcard 下还有一个子目录  android
        Dir android =  new Folder("android");
        //android 目录下有一个目录
        Dir data = new Folder("data");
        data.addDir(new File("2019-09-14.log"));
        android.addDir(data);
        diskSdcard.addDir(android);

        //sdcard 下还有一个子目录 baidu
        Dir baidu =  new Folder("baidu");
        //android 目录下有一个目录
        Dir cache = new Folder("cache");
        cache.addDir(new File("offline.baidu"));
        baidu.addDir(cache);
        diskSdcard.addDir(baidu);

        //sdcard 下还有一个子目录 downloads
        Dir downloads =  new Folder("downloads");
        //android 目录下有一个目录
        Dir f360 = new Folder("360");
        f360.addDir(new File("360.log"));
        downloads.addDir(f360);
        diskSdcard.addDir(downloads);

        //打印文件结构
        diskSdcard.print();
    }


    @Test
    public void testAdapter1(){
        VoltAdapter voltAdapter = new VoltAdapter(new Volt220());
        System.out.println("voltAdapter:"+voltAdapter.getVolt5());
    }


    @Test
    public void testDecorator(){
        //首先得有一个男孩
        com.devyk.android_dp_code.decorator.Person person = new Boy();
        //先穿上便宜的衣服
        PersonCloth cheapCloth = new CheapCloth(person);
        cheapCloth.dressed();

        //或者在穿上有点档次的衣服
        PersonCloth personCloth = new ExpensiveCloth(person);
        personCloth.dressed();

    }

    @Test
    public void testFlaweiget(){



        Ticket ticket1 = TicketFactory.getTicket("北京", "上海");
        ticket1.showTicketInfo("上铺");
        Ticket ticket7 = TicketFactory.getTicket("北京", "上海");
        ticket7.showTicketInfo("下铺");
        Ticket ticket2 = TicketFactory.getTicket("北京", "上海");
        ticket2.showTicketInfo("上铺");
        Ticket ticket3 = TicketFactory.getTicket("北京", "上海");
        ticket3.showTicketInfo("上铺");
        Ticket ticket4 = TicketFactory.getTicket("北京", "成都");
        ticket4.showTicketInfo("下铺");
        Ticket ticket5 = TicketFactory.getTicket("北京", "上海");
        ticket5.showTicketInfo("上铺");
        Ticket ticket6 = TicketFactory.getTicket("北京", "上海");
        ticket6.showTicketInfo("上铺");
    }

    @Test
    public void testFacade(){

        Phone phone = new PhoneImpl();
        ICamera camera = new CameraImpl();
        MobilePhone mobilePhone = new MobilePhone(phone,camera);

        mobilePhone.dail();
        mobilePhone.videoChat();
        mobilePhone.takePicture();
        mobilePhone.stop();
    }


    @Test
    public void testBridge(){
        //原味
        CoffeeAdditives coffeeAdditives = new Ordinary();
        //加糖
        CoffeeAdditives coffeeAdditives1 = new Sugar();
        //大杯原味
        LargeCoffee largeCoffee = new LargeCoffee(coffeeAdditives);
        largeCoffee.makeCoffee();
        //小杯原味
        SmallCoffee smallCoffee = new SmallCoffee(coffeeAdditives);
        smallCoffee.makeCoffee();

        //大杯加糖
        LargeCoffee largeCoffee2 = new LargeCoffee(coffeeAdditives1);
        largeCoffee2.makeCoffee();
        //小杯加糖
        SmallCoffee smallCoffee3 = new SmallCoffee(coffeeAdditives1);
        smallCoffee3.makeCoffee();
    }
}

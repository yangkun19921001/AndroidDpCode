package com.devyk.android_dp_code.mediator.test2;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 16:54
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is MainBoard
 * </pre>
 */
public class MainBoard extends Mediator {

    /**
     * 光驱设备
     */
    private CDDevice cdDevice;
    /**
     * CPU
     */
    private CPU cpu;
    /**
     * 声卡设备
     */
    private SoundCard soundCard;
    /**
     * 光驱设备
     */
    private GraphicsCard graphicsCard;


    @Override
    public void changed(Colleague c) {
        //如果是光驱读取了数据
        if (c == cdDevice){
            handleCD((CDDevice)c);
        }

        //如果 CPU 处理完数据
        if (c == cpu){
            handleCPU((CPU)c);
        }

    }

    /**
     * 处理 CPU 读取数据后与其它设备的交互
     * @param cpu
     */
    private void handleCPU(CPU cpu) {
        this.soundCard.soundPlay(cpu.getDataSound());
        this.graphicsCard.videoPlay(cpu.getDataVideo());


    }

    /**
     * 处理光驱读取数据后与其它设备的交互
     * @param cdDevice
     */
    private void handleCD(CDDevice cdDevice) {
        this.cpu.decodeData(cdDevice.read());
    }


    /**
     * 设置 CPU
     */
    public  void  setCPU(CPU cpu){
        this.cpu = cpu;
    }

    /**
     * 设置 CD
     */
    public void  setCdDevice(CDDevice cdDevice){
        this.cdDevice = cdDevice;
    }

    /**
     * 设置声卡
     */
    public void setSoundCard(SoundCard soundCard){
        this.soundCard = soundCard;
    }

    /**
     * 设置显卡
     */
    public void setGraphicsCard(GraphicsCard graphicsCard){
        this.graphicsCard = graphicsCard;
    }
}

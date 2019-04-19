package com.goldze.home.entitty;

import com.blankj.utilcode.util.DeviceUtils;

public class ToutiaoRequest {
   /*
    *
    category：见下category表格
refer：???，固定值1
count：返回数量，默认为20
min_behot_time：上次请求时间的时间戳，例：1491981025
last_refresh_sub_entrance_interval：本次请求时间的时间戳，例：1491981165
loc_mode：
loc_time：本地时间
latitude：经度
longitude：纬度
city：当前城市
iid：某个唯一 id，长度为10
device_id：设备 id，长度为11
openudid：某个唯一 id，长度为16
    * */

   public String category = "";
   public int refer = 1;
   public int count = 20;
   public long min_behot_time = 0;
   public long last_refresh_sub_entrance_interval = 0;
   public long loc_time = 0;
   public float latitude = 0;
   public float longitude = 0;
   public String city="";
   public String iid="0123456789";
   public String device_id= DeviceUtils.getAndroidID();
   public String openudid="";
}

# CoolWeather
Android查询天气
视图层：页面采用线性布局+碎片，下拉可以刷新状态，菜单选项中使用listview。
模型层：包含各省市县各种天气数据以及省市县的id
控制层：使用OKHttp访问服务器，并且使用Gson解析服务器返回的省市县数据以及天气数据；实例化视图层中的各个控件，
        包含菜单选项中的查询省市县，主界面中的天气信息，背景图片。设置后台服务，每隔8小时更新一次天气信息。
APP截图：
![image](https://github.com/callmexiaolu/CoolWeather.git/Screen

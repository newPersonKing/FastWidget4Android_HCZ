___
知识点：   
1 FolioView 翻页效果，原理view 转换成Bitmap，然后交由FolioView 绘制上中下三张bitmap。   
2 BlindsView 百叶窗翻页效果, 原理每个Bitmap分解成 RotateView ，根据旋转进度 切换Bitmap。   
3 WaveBallProgress 波浪线进度   
4 ScrollFoldActivity 滑动折叠 实现原理 随着滑动动态修改item高哦度   
5 淹没展开动画 FloodAndSpreadActivity ObjectAnimator 动态修改高度 ObjectAnimator 对应的属性的初始值是对应属性的get方法返回的值。   
6 SwipeMenuListActivity 侧滑删除 原理OnItemTouchListener view的重叠 新的api RecyclerView.findChildViewUnder   
7 WheelActivity 根据手势计算旋转角度   
8 无限轮播的viewPager 原理 getCount 返回一个很大的值   
9 可拖动排序的GridView   
10 仿书页 setBackground 与 onDraw 的完美结合

___

This library include many amazing widgets or views. 

# WaveBallProgress
It is a ProgressBar witch\`s shape is glass ball with water in it. The line of water represents the value of progress. And when the value of progress changed, the water will fluctuate. Show in the gif below.

![](https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/wave-ball-progress.gif)

# FloodAndSpreadActivity
It is a complex animation which include two step: flood and spead. This can be used as the transition. Show in the gif below.

![](https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/flood-and-spread.gif)

# BlindsView
It is a view which can show an animation as blind. You can use it in AnimationListView, such as the used in BlindsListViewActivity. Show in the gif below.

![](https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/blind.gif)

# FolioView
It is a view which can show an animation as folio. You can use it in AnimationListView, such as the used in FolioListViewActivity. Show in the gif below.

![](https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/folio.gif)

# ScrollFoldList
It is a list view which can highlight the first item. If scroll the list, the first item will fold and the second item will spread. Show in the gif below.

![](https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/scroll-fold-list-iloveimg-compressed.gif)

# SwipeMenuTouchListener&SwipeMenuViewHolder
It is a simple solution about swipe menu in RecyclerView. You can refer to the class "SwipeMenuListActivity" for how to use. Show in the gif below.

![](https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/swipe_menu_recyclerview.gif)

# Contact Me
<img src="https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/qrinfo-BennuCTech-scan.jpg" width="45%"/><img src="https://github.com/chzphoenix/FastWidget4Android_HCZ/blob/master/Wechat.jpeg" width="45%"/>

import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussnongzuowu from '@/views/modules/discussnongzuowu/list'
    import jingdianleixing from '@/views/modules/jingdianleixing/list'
    import discusszhoubiancanyin from '@/views/modules/discusszhoubiancanyin/list'
    import jingdianxinxi from '@/views/modules/jingdianxinxi/list'
    import discussnongjialehuodong from '@/views/modules/discussnongjialehuodong/list'
    import nongzuowuleixing from '@/views/modules/nongzuowuleixing/list'
    import storeup from '@/views/modules/storeup/list'
    import discusszhoubianzhusu from '@/views/modules/discusszhoubianzhusu/list'
    import canyinleixing from '@/views/modules/canyinleixing/list'
    import nongzuowu from '@/views/modules/nongzuowu/list'
    import nongjialehuodong from '@/views/modules/nongjialehuodong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import menpiaogoumai from '@/views/modules/menpiaogoumai/list'
    import discussjingdianxinxi from '@/views/modules/discussjingdianxinxi/list'
    import zhoubiancanyin from '@/views/modules/zhoubiancanyin/list'
    import zhusuyuding from '@/views/modules/zhusuyuding/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'
    import zhoubianzhusu from '@/views/modules/zhoubianzhusu/list'
    import fangzileixing from '@/views/modules/fangzileixing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '旅游咨询',
        component: news
      }
          ,{
	path: '/discussnongzuowu',
        name: '农作物评论',
        component: discussnongzuowu
      }
          ,{
	path: '/jingdianleixing',
        name: '景点类型',
        component: jingdianleixing
      }
          ,{
	path: '/discusszhoubiancanyin',
        name: '周边餐饮评论',
        component: discusszhoubiancanyin
      }
          ,{
	path: '/jingdianxinxi',
        name: '景点信息',
        component: jingdianxinxi
      }
          ,{
	path: '/discussnongjialehuodong',
        name: '农家乐活动评论',
        component: discussnongjialehuodong
      }
          ,{
	path: '/nongzuowuleixing',
        name: '农作物类型',
        component: nongzuowuleixing
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/discusszhoubianzhusu',
        name: '周边住宿评论',
        component: discusszhoubianzhusu
      }
          ,{
	path: '/canyinleixing',
        name: '餐饮类型',
        component: canyinleixing
      }
          ,{
	path: '/nongzuowu',
        name: '农作物',
        component: nongzuowu
      }
          ,{
	path: '/nongjialehuodong',
        name: '农家乐活动',
        component: nongjialehuodong
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/menpiaogoumai',
        name: '门票购买',
        component: menpiaogoumai
      }
          ,{
	path: '/discussjingdianxinxi',
        name: '景点信息评论',
        component: discussjingdianxinxi
      }
          ,{
	path: '/zhoubiancanyin',
        name: '周边餐饮',
        component: zhoubiancanyin
      }
          ,{
	path: '/zhusuyuding',
        name: '住宿预订',
        component: zhusuyuding
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/zhoubianzhusu',
        name: '周边住宿',
        component: zhoubianzhusu
      }
          ,{
	path: '/fangzileixing',
        name: '房子类型',
        component: fangzileixing
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

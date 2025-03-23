
var projectName = '农家乐信息平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '周边住宿',
	url: './pages/zhoubianzhusu/list.html'
}, 
{
	name: '景点信息',
	url: './pages/jingdianxinxi/list.html'
}, 
{
	name: '周边餐饮',
	url: './pages/zhoubiancanyin/list.html'
}, 
{
	name: '农作物',
	url: './pages/nongzuowu/list.html'
}, 
{
	name: '农家乐活动',
	url: './pages/nongjialehuodong/list.html'
}, 

{
	name: '旅游咨询',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmsi3i6/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"周边住宿","menuJump":"列表","tableName":"zhoubianzhusu"}],"menu":"周边住宿管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房子类型","menuJump":"列表","tableName":"fangzileixing"}],"menu":"房子类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"景点信息","menuJump":"列表","tableName":"jingdianxinxi"}],"menu":"景点信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"景点类型","menuJump":"列表","tableName":"jingdianleixing"}],"menu":"景点类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"周边餐饮","menuJump":"列表","tableName":"zhoubiancanyin"}],"menu":"周边餐饮管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"农作物类型","menuJump":"列表","tableName":"nongzuowuleixing"}],"menu":"农作物类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"门票购买","menuJump":"列表","tableName":"menpiaogoumai"}],"menu":"门票购买管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"餐饮类型","menuJump":"列表","tableName":"canyinleixing"}],"menu":"餐饮类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"住宿预订","menuJump":"列表","tableName":"zhusuyuding"}],"menu":"住宿预订管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"农作物","menuJump":"列表","tableName":"nongzuowu"}],"menu":"农作物管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"农家乐活动","menuJump":"列表","tableName":"nongjialehuodong"}],"menu":"农家乐活动管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"旅游咨询","tableName":"news"}],"menu":"系统管理"},{"child":[{"buttons":["查看","修改","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看","修改","删除"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看","修改","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","修改","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看","修改","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看","修改","删除"],"menu":"已取消订单","tableName":"orders/已取消"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","预定"],"menu":"周边住宿列表","menuJump":"列表","tableName":"zhoubianzhusu"}],"menu":"周边住宿模块"},{"child":[{"buttons":["查看","购买"],"menu":"景点信息列表","menuJump":"列表","tableName":"jingdianxinxi"}],"menu":"景点信息模块"},{"child":[{"buttons":["查看"],"menu":"周边餐饮列表","menuJump":"列表","tableName":"zhoubiancanyin"}],"menu":"周边餐饮模块"},{"child":[{"buttons":["查看"],"menu":"农作物列表","menuJump":"列表","tableName":"nongzuowu"}],"menu":"农作物模块"},{"child":[{"buttons":["查看"],"menu":"农家乐活动列表","menuJump":"列表","tableName":"nongjialehuodong"}],"menu":"农家乐活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付"],"menu":"门票购买","menuJump":"列表","tableName":"menpiaogoumai"}],"menu":"门票购买管理"},{"child":[{"buttons":["查看","支付"],"menu":"住宿预订","menuJump":"列表","tableName":"zhusuyuding"}],"menu":"住宿预订管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","确认收货"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","预定"],"menu":"周边住宿列表","menuJump":"列表","tableName":"zhoubianzhusu"}],"menu":"周边住宿模块"},{"child":[{"buttons":["查看","购买"],"menu":"景点信息列表","menuJump":"列表","tableName":"jingdianxinxi"}],"menu":"景点信息模块"},{"child":[{"buttons":["查看"],"menu":"周边餐饮列表","menuJump":"列表","tableName":"zhoubiancanyin"}],"menu":"周边餐饮模块"},{"child":[{"buttons":["查看"],"menu":"农作物列表","menuJump":"列表","tableName":"nongzuowu"}],"menu":"农作物模块"},{"child":[{"buttons":["查看"],"menu":"农家乐活动列表","menuJump":"列表","tableName":"nongjialehuodong"}],"menu":"农家乐活动模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

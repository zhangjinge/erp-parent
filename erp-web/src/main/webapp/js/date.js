// 对Date的扩展，将 Date 转化为指定格式的String   
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，   
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423   
// (new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18   
Date.prototype.Format = function(fmt) {//Date是js对象
  if(isNaN(this.getDate())){//如果当前日期是空的
      return"";
  }
  var _date={
      "M+" : this.getMonth()+1,
      "d+" : this.getDate(),
      "h+" : this.getHours(),
      "m+" : this.getMinutes(),
      "s+" : this.getSeconds(),
      "q+" : Math.floor((this.getMonth()+3)/3),
      "S"  : this.getMilliseconds()
  };
  if(/(y+)/.test(fmt)){
      fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
  }
  for(var k in _date){
      if(new RegExp("("+ k +")").test(fmt)){
          fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (_date[k]) : (("00"+ _date[k]).substr((""+ _date[k]).length)));
      }
  }
  return fmt;
};
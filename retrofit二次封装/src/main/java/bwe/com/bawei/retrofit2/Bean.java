package bwe.com.bawei.retrofit2;

import java.util.List;

/**
 * Created by 猥琐的熊猫 on 2017/12/17.
 */

public class Bean {

    /**
     * reason : 请求成功
     * result : {"list":[{"id":"wechat_20171217010037","title":"一位南北朝名臣突然病逝，从此改变了中国历史，让中国大一统推迟了一百多年！","source":"读史","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068638.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217010037"},{"id":"wechat_20171217009966","title":"超越时代的双三角翼\u2014\u2014瑞典萨博-35\u201c龙\u201d式战斗机","source":"空军之翼","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068603.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217009966"},{"id":"wechat_20171217009192","title":"将手伸向美国后院？俄罗斯新型情报调查船进入阿根廷港口","source":"云上的空母","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068550.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217009192"},{"id":"wechat_20171217009191","title":"将手伸向美国后院？俄罗斯新型情报调查船进入阿根廷港口","source":"云上的空母","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068549.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217009191"},{"id":"wechat_20171217006861","title":"守护北疆生态安全！瞧瞧内蒙古兴安盟检察机关\u201c三位一体\u201d模式","source":"最高人民检察院","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068543.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217006861"},{"id":"wechat_20171217006852","title":"检察官庭前反串\u201c辩护人\u201d 目的是最大限度避免案件瑕疵","source":"最高人民检察院","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068542.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217006852"},{"id":"wechat_20171217006853","title":"可规范111项监督节点 广东侦查活动监督平台被推广到10省份","source":"最高人民检察院","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068541.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217006853"},{"id":"wechat_20171217003064","title":"到底谁在说谎？俄国防部称苏-35从后方接近并逼退美军F-22","source":"军机图","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068524.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217003064"},{"id":"wechat_20171217003065","title":"到底谁在说谎？俄国防部称苏-35从后方接近并逼退美军F-22","source":"军机图","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068524.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217003065"},{"id":"wechat_20171217001832","title":"002航母为何比辽宁舰战力增三倍？但003直追美军 中国远洋海军加速","source":"军评陈光文","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-60122188.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217001832"}],"totalPage":21156,"ps":10,"pno":1}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * list : [{"id":"wechat_20171217010037","title":"一位南北朝名臣突然病逝，从此改变了中国历史，让中国大一统推迟了一百多年！","source":"读史","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068638.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217010037"},{"id":"wechat_20171217009966","title":"超越时代的双三角翼\u2014\u2014瑞典萨博-35\u201c龙\u201d式战斗机","source":"空军之翼","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068603.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217009966"},{"id":"wechat_20171217009192","title":"将手伸向美国后院？俄罗斯新型情报调查船进入阿根廷港口","source":"云上的空母","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068550.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217009192"},{"id":"wechat_20171217009191","title":"将手伸向美国后院？俄罗斯新型情报调查船进入阿根廷港口","source":"云上的空母","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068549.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217009191"},{"id":"wechat_20171217006861","title":"守护北疆生态安全！瞧瞧内蒙古兴安盟检察机关\u201c三位一体\u201d模式","source":"最高人民检察院","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068543.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217006861"},{"id":"wechat_20171217006852","title":"检察官庭前反串\u201c辩护人\u201d 目的是最大限度避免案件瑕疵","source":"最高人民检察院","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068542.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217006852"},{"id":"wechat_20171217006853","title":"可规范111项监督节点 广东侦查活动监督平台被推广到10省份","source":"最高人民检察院","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068541.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217006853"},{"id":"wechat_20171217003064","title":"到底谁在说谎？俄国防部称苏-35从后方接近并逼退美军F-22","source":"军机图","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068524.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217003064"},{"id":"wechat_20171217003065","title":"到底谁在说谎？俄国防部称苏-35从后方接近并逼退美军F-22","source":"军机图","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068524.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217003065"},{"id":"wechat_20171217001832","title":"002航母为何比辽宁舰战力增三倍？但003直追美军 中国远洋海军加速","source":"军评陈光文","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-60122188.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171217001832"}]
         * totalPage : 21156
         * ps : 10
         * pno : 1
         */

        private int totalPage;
        private int ps;
        private int pno;
        private List<ListBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : wechat_20171217010037
             * title : 一位南北朝名臣突然病逝，从此改变了中国历史，让中国大一统推迟了一百多年！
             * source : 读史
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-61068638.jpg/640
             * mark :
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20171217010037
             */

            private String id;
            private String title;
            private String source;
            private String firstImg;
            private String mark;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}

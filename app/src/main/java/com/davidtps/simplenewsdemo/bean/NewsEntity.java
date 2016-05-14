package com.davidtps.simplenewsdemo.bean;

import java.util.List;

/**
 * Created by davidtps on 2016/5/12 0012.
 */
public class NewsEntity {


    /**
     * postid : PHOT3JFP000100AO
     * hasCover : false
     * hasHead : 1
     * replyCount : 26746
     * hasImg : 1
     * digest :
     * hasIcon : false
     * docid : 9IG74V5H00963VRO_BMSF70D6luowenwenupdateDoc
     * title : 美国测试超级高铁画面 比飞机快
     * order : 1
     * priority : 254
     * lmodify : 2016-05-12 14:35:24
     * boardid : photoview_bbs
     * ads : [{"title":"台湾发生6.2级地震 多地有震感","tag":"photoset","imgsrc":"http://img2.cache.netease.com/3g/2016/5/12/201605121256010a59c.jpg","subtitle":"","url":"00AN0001|118254"},{"title":"遇难者家属在北川老县城祭奠亲人","tag":"photoset","imgsrc":"http://img6.cache.netease.com/3g/2016/5/12/201605121021208130f.jpg","subtitle":"","url":"00AN0001|118232"},{"title":"NASA拍摄加拿大火灾烟雾弥漫画面","tag":"photoset","imgsrc":"http://img6.cache.netease.com/3g/2016/5/12/2016051211481928171.jpg","subtitle":"","url":"00AO0001|118241"},{"title":"放生池乌龟\"超载\" 将被运至水库","tag":"photoset","imgsrc":"http://img5.cache.netease.com/3g/2016/5/12/2016051208241266ea9.jpg","subtitle":"","url":"00AP0001|118220"},{"title":"鸵鸟当街\"暴走\" 被抓捕后死亡","tag":"photoset","imgsrc":"http://img2.cache.netease.com/3g/2016/5/12/201605120954122415e.jpg","subtitle":"","url":"00AP0001|118217"}]
     * photosetID : 00AO0001|118265
     * template : manual
     * votecount : 24697
     * skipID : 00AO0001|118265
     * alias : Top News
     * skipType : photoset
     * cid : C1348646712614
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://img6.cache.netease.com/3g/2016/5/12/20160512143621f0846.jpg"},{"imgsrc":"http://img3.cache.netease.com/3g/2016/5/12/20160512143623ae38f.jpg"}]
     * source : 中新网
     * ename : androidnews
     * tname : 头条
     * imgsrc : http://img1.cache.netease.com/3g/2016/5/12/20160512143619e4ffe.jpg
     * ptime : 2016-05-12 14:35:24
     */

    private List<T1348647909107Entity> T1348647909107;

    public List<T1348647909107Entity> getT1348647909107() {
        return T1348647909107;
    }

    public void setT1348647909107(List<T1348647909107Entity> T1348647909107) {
        this.T1348647909107 = T1348647909107;
    }

    public static class T1348647909107Entity {
        private String postid;
        private boolean hasCover;
        private int hasHead;
        private int replyCount;
        private int hasImg;
        private String digest;
        private boolean hasIcon;
        private String docid;
        private String title;
        private int order;
        private int priority;
        private String lmodify;
        private String boardid;
        private String photosetID;
        private String template;
        private int votecount;
        private String skipID;
        private String alias;
        private String skipType;
        private String cid;
        private int hasAD;
        private String source;
        private String ename;
        private String tname;
        private String imgsrc;
        private String ptime;
        /**
         * title : 台湾发生6.2级地震 多地有震感
         * tag : photoset
         * imgsrc : http://img2.cache.netease.com/3g/2016/5/12/201605121256010a59c.jpg
         * subtitle :
         * url : 00AN0001|118254
         */

        private List<AdsEntity> ads;
        /**
         * imgsrc : http://img6.cache.netease.com/3g/2016/5/12/20160512143621f0846.jpg
         */

        private List<ImgextraEntity> imgextra;

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public List<AdsEntity> getAds() {
            return ads;
        }

        public void setAds(List<AdsEntity> ads) {
            this.ads = ads;
        }

        public List<ImgextraEntity> getImgextra() {
            return imgextra;
        }

        public void setImgextra(List<ImgextraEntity> imgextra) {
            this.imgextra = imgextra;
        }

        public static class AdsEntity {
            private String title;
            private String tag;
            private String imgsrc;
            private String subtitle;
            private String url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class ImgextraEntity {
            private String imgsrc;

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }
        }
    }
}

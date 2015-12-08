// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope
    extends Freezable
{
    public static class Builder
    {

        private String mName;
        private String zzEl;
        private String zzF;
        private String zzKI;
        private final Set zzaHQ = new HashSet();
        private ItemScopeEntity zzaHR;
        private List zzaHS;
        private ItemScopeEntity zzaHT;
        private String zzaHU;
        private String zzaHV;
        private String zzaHW;
        private List zzaHX;
        private int zzaHY;
        private List zzaHZ;
        private String zzaIA;
        private String zzaIB;
        private ItemScopeEntity zzaIC;
        private String zzaID;
        private String zzaIE;
        private String zzaIF;
        private ItemScopeEntity zzaIG;
        private String zzaIH;
        private String zzaII;
        private String zzaIJ;
        private String zzaIK;
        private ItemScopeEntity zzaIa;
        private List zzaIb;
        private String zzaIc;
        private String zzaId;
        private ItemScopeEntity zzaIe;
        private String zzaIf;
        private String zzaIg;
        private List zzaIh;
        private String zzaIi;
        private String zzaIj;
        private String zzaIk;
        private String zzaIl;
        private String zzaIm;
        private String zzaIn;
        private String zzaIo;
        private String zzaIp;
        private ItemScopeEntity zzaIq;
        private String zzaIr;
        private String zzaIs;
        private String zzaIt;
        private ItemScopeEntity zzaIu;
        private ItemScopeEntity zzaIv;
        private ItemScopeEntity zzaIw;
        private List zzaIx;
        private String zzaIy;
        private String zzaIz;
        private String zzakM;
        private double zzaxB;
        private double zzaxC;
        private String zzsB;

        public ItemScope build()
        {
            return new ItemScopeEntity(zzaHQ, zzaHR, zzaHS, zzaHT, zzaHU, zzaHV, zzaHW, zzaHX, zzaHY, zzaHZ, zzaIa, zzaIb, zzaIc, zzaId, zzaIe, zzaIf, zzaIg, zzsB, zzaIh, zzaIi, zzaIj, zzaIk, zzakM, zzaIl, zzaIm, zzaIn, zzaIo, zzaIp, zzaIq, zzaIr, zzaIs, zzKI, zzaIt, zzaIu, zzaxB, zzaIv, zzaxC, mName, zzaIw, zzaIx, zzaIy, zzaIz, zzaIA, zzaIB, zzaIC, zzaID, zzaIE, zzaIF, zzaIG, zzaIH, zzaII, zzEl, zzF, zzaIJ, zzaIK);
        }

        public Builder setAbout(ItemScope itemscope)
        {
            zzaHR = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            zzaHS = list;
            zzaHQ.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            zzaHT = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            zzaHU = s;
            zzaHQ.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            zzaHV = s;
            zzaHQ.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            zzaHW = s;
            zzaHQ.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            zzaHX = list;
            zzaHQ.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            zzaHY = i;
            zzaHQ.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            zzaHZ = list;
            zzaHQ.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            zzaIa = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            zzaIb = list;
            zzaHQ.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            zzaIc = s;
            zzaHQ.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            zzaId = s;
            zzaHQ.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            zzaIe = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            zzaIf = s;
            zzaHQ.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            zzaIg = s;
            zzaHQ.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            zzsB = s;
            zzaHQ.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            zzaIh = list;
            zzaHQ.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            zzaIi = s;
            zzaHQ.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            zzaIj = s;
            zzaHQ.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            zzaIk = s;
            zzaHQ.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            zzakM = s;
            zzaHQ.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            zzaIl = s;
            zzaHQ.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            zzaIm = s;
            zzaHQ.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            zzaIn = s;
            zzaHQ.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            zzaIo = s;
            zzaHQ.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            zzaIp = s;
            zzaHQ.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            zzaIq = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            zzaIr = s;
            zzaHQ.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            zzaIs = s;
            zzaHQ.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            zzKI = s;
            zzaHQ.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            zzaIt = s;
            zzaHQ.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            zzaIu = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            zzaxB = d;
            zzaHQ.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            zzaIv = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            zzaxC = d;
            zzaHQ.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            zzaHQ.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            zzaIw = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            zzaIx = list;
            zzaHQ.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            zzaIy = s;
            zzaHQ.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            zzaIz = s;
            zzaHQ.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            zzaIA = s;
            zzaHQ.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            zzaIB = s;
            zzaHQ.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            zzaIC = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            zzaID = s;
            zzaHQ.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            zzaIE = s;
            zzaHQ.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            zzaIF = s;
            zzaHQ.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            zzaIG = (ItemScopeEntity)itemscope;
            zzaHQ.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            zzaIH = s;
            zzaHQ.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            zzaII = s;
            zzaHQ.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            zzEl = s;
            zzaHQ.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            zzF = s;
            zzaHQ.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            zzaIJ = s;
            zzaHQ.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            zzaIK = s;
            zzaHQ.add(Integer.valueOf(56));
            return this;
        }

        public Builder()
        {
        }
    }


    public abstract ItemScope getAbout();

    public abstract List getAdditionalName();

    public abstract ItemScope getAddress();

    public abstract String getAddressCountry();

    public abstract String getAddressLocality();

    public abstract String getAddressRegion();

    public abstract List getAssociated_media();

    public abstract int getAttendeeCount();

    public abstract List getAttendees();

    public abstract ItemScope getAudio();

    public abstract List getAuthor();

    public abstract String getBestRating();

    public abstract String getBirthDate();

    public abstract ItemScope getByArtist();

    public abstract String getCaption();

    public abstract String getContentSize();

    public abstract String getContentUrl();

    public abstract List getContributor();

    public abstract String getDateCreated();

    public abstract String getDateModified();

    public abstract String getDatePublished();

    public abstract String getDescription();

    public abstract String getDuration();

    public abstract String getEmbedUrl();

    public abstract String getEndDate();

    public abstract String getFamilyName();

    public abstract String getGender();

    public abstract ItemScope getGeo();

    public abstract String getGivenName();

    public abstract String getHeight();

    public abstract String getId();

    public abstract String getImage();

    public abstract ItemScope getInAlbum();

    public abstract double getLatitude();

    public abstract ItemScope getLocation();

    public abstract double getLongitude();

    public abstract String getName();

    public abstract ItemScope getPartOfTVSeries();

    public abstract List getPerformers();

    public abstract String getPlayerType();

    public abstract String getPostOfficeBoxNumber();

    public abstract String getPostalCode();

    public abstract String getRatingValue();

    public abstract ItemScope getReviewRating();

    public abstract String getStartDate();

    public abstract String getStreetAddress();

    public abstract String getText();

    public abstract ItemScope getThumbnail();

    public abstract String getThumbnailUrl();

    public abstract String getTickerSymbol();

    public abstract String getType();

    public abstract String getUrl();

    public abstract String getWidth();

    public abstract String getWorstRating();

    public abstract boolean hasAbout();

    public abstract boolean hasAdditionalName();

    public abstract boolean hasAddress();

    public abstract boolean hasAddressCountry();

    public abstract boolean hasAddressLocality();

    public abstract boolean hasAddressRegion();

    public abstract boolean hasAssociated_media();

    public abstract boolean hasAttendeeCount();

    public abstract boolean hasAttendees();

    public abstract boolean hasAudio();

    public abstract boolean hasAuthor();

    public abstract boolean hasBestRating();

    public abstract boolean hasBirthDate();

    public abstract boolean hasByArtist();

    public abstract boolean hasCaption();

    public abstract boolean hasContentSize();

    public abstract boolean hasContentUrl();

    public abstract boolean hasContributor();

    public abstract boolean hasDateCreated();

    public abstract boolean hasDateModified();

    public abstract boolean hasDatePublished();

    public abstract boolean hasDescription();

    public abstract boolean hasDuration();

    public abstract boolean hasEmbedUrl();

    public abstract boolean hasEndDate();

    public abstract boolean hasFamilyName();

    public abstract boolean hasGender();

    public abstract boolean hasGeo();

    public abstract boolean hasGivenName();

    public abstract boolean hasHeight();

    public abstract boolean hasId();

    public abstract boolean hasImage();

    public abstract boolean hasInAlbum();

    public abstract boolean hasLatitude();

    public abstract boolean hasLocation();

    public abstract boolean hasLongitude();

    public abstract boolean hasName();

    public abstract boolean hasPartOfTVSeries();

    public abstract boolean hasPerformers();

    public abstract boolean hasPlayerType();

    public abstract boolean hasPostOfficeBoxNumber();

    public abstract boolean hasPostalCode();

    public abstract boolean hasRatingValue();

    public abstract boolean hasReviewRating();

    public abstract boolean hasStartDate();

    public abstract boolean hasStreetAddress();

    public abstract boolean hasText();

    public abstract boolean hasThumbnail();

    public abstract boolean hasThumbnailUrl();

    public abstract boolean hasTickerSymbol();

    public abstract boolean hasType();

    public abstract boolean hasUrl();

    public abstract boolean hasWidth();

    public abstract boolean hasWorstRating();
}

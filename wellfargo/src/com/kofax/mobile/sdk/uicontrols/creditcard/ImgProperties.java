// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;


public class ImgProperties
{

    static ImgProperties a = null;
    public String img_date_time;
    public int img_dpi;
    public String img_file_path;
    public int img_ht;
    public int img_jpeg_quality;
    public String img_latitude;
    public String img_longtitude;
    public String img_metadata;
    public String img_mime;
    public String img_output;
    public String img_pitch;
    public String img_rep;
    public String img_roll;
    public String img_tag;
    public int img_wd;

    public ImgProperties()
    {
    }

    public static ImgProperties get_instance()
    {
        if (a == null)
        {
            a = new ImgProperties();
        }
        return a;
    }

}

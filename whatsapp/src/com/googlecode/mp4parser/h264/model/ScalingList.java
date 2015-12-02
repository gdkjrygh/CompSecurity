// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.IOException;

public class ScalingList
{

    public int scalingList[];
    public boolean useDefaultScalingMatrixFlag;

    public ScalingList()
    {
    }

    public static ScalingList read(CAVLCReader cavlcreader, int i)
        throws IOException
    {
        ScalingList scalinglist = new ScalingList();
        scalinglist.scalingList = new int[i];
        int k = 8;
        int i1 = 8;
        int l = 0;
        do
        {
            if (l >= i)
            {
                return scalinglist;
            }
            int j = i1;
            if (i1 != 0)
            {
                j = (k + cavlcreader.readSE("deltaScale") + 256) % 256;
                int ai[];
                boolean flag;
                if (l == 0 && j == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                scalinglist.useDefaultScalingMatrixFlag = flag;
            }
            ai = scalinglist.scalingList;
            if (j != 0)
            {
                k = j;
            }
            ai[l] = k;
            k = scalinglist.scalingList[l];
            l++;
            i1 = j;
        } while (true);
    }

    public String toString()
    {
        return (new StringBuilder("ScalingList{scalingList=")).append(scalingList).append(", useDefaultScalingMatrixFlag=").append(useDefaultScalingMatrixFlag).append('}').toString();
    }

    public void write(CAVLCWriter cavlcwriter)
        throws IOException
    {
        if (useDefaultScalingMatrixFlag)
        {
            cavlcwriter.writeSE(0, "SPS: ");
        } else
        {
            int j = 8;
            int i = 0;
            while (i < scalingList.length) 
            {
                if (8 != 0)
                {
                    cavlcwriter.writeSE(scalingList[i] - j - 256, "SPS: ");
                }
                j = scalingList[i];
                i++;
            }
        }
    }
}

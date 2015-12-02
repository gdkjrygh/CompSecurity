// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;

import java.util.Arrays;

public class HRDParameters
{

    public int bit_rate_scale;
    public int bit_rate_value_minus1[];
    public boolean cbr_flag[];
    public int cpb_cnt_minus1;
    public int cpb_removal_delay_length_minus1;
    public int cpb_size_scale;
    public int cpb_size_value_minus1[];
    public int dpb_output_delay_length_minus1;
    public int initial_cpb_removal_delay_length_minus1;
    public int time_offset_length;

    public HRDParameters()
    {
    }

    public String toString()
    {
        return (new StringBuilder("HRDParameters{cpb_cnt_minus1=")).append(cpb_cnt_minus1).append(", bit_rate_scale=").append(bit_rate_scale).append(", cpb_size_scale=").append(cpb_size_scale).append(", bit_rate_value_minus1=").append(Arrays.toString(bit_rate_value_minus1)).append(", cpb_size_value_minus1=").append(Arrays.toString(cpb_size_value_minus1)).append(", cbr_flag=").append(Arrays.toString(cbr_flag)).append(", initial_cpb_removal_delay_length_minus1=").append(initial_cpb_removal_delay_length_minus1).append(", cpb_removal_delay_length_minus1=").append(cpb_removal_delay_length_minus1).append(", dpb_output_delay_length_minus1=").append(dpb_output_delay_length_minus1).append(", time_offset_length=").append(time_offset_length).append('}').toString();
    }
}

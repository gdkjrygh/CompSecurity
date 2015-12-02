// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

public static class SliceType.SI
{
    public static final class SliceType extends Enum
    {

        public static final SliceType B;
        private static final SliceType ENUM$VALUES[];
        public static final SliceType I;
        public static final SliceType P;
        public static final SliceType SI;
        public static final SliceType SP;

        public static SliceType valueOf(String s)
        {
            return (SliceType)Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader$SliceType, s);
        }

        public static SliceType[] values()
        {
            SliceType aslicetype[] = ENUM$VALUES;
            int i = aslicetype.length;
            SliceType aslicetype1[] = new SliceType[i];
            System.arraycopy(aslicetype, 0, aslicetype1, 0, i);
            return aslicetype1;
        }

        static 
        {
            P = new SliceType("P", 0);
            B = new SliceType("B", 1);
            I = new SliceType("I", 2);
            SP = new SliceType("SP", 3);
            SI = new SliceType("SI", 4);
            ENUM$VALUES = (new SliceType[] {
                P, B, I, SP, SI
            });
        }

        private SliceType(String s, int i)
        {
            super(s, i);
        }
    }


    public boolean bottom_field_flag;
    public int colour_plane_id;
    public int delta_pic_order_cnt_bottom;
    public boolean field_pic_flag;
    public int first_mb_in_slice;
    public int frame_num;
    public int idr_pic_id;
    public int pic_order_cnt_lsb;
    public int pic_parameter_set_id;
    public SliceType slice_type;

    public String toString()
    {
        return (new StringBuilder("SliceHeader{first_mb_in_slice=")).append(first_mb_in_slice).append(", slice_type=").append(slice_type).append(", pic_parameter_set_id=").append(pic_parameter_set_id).append(", colour_plane_id=").append(colour_plane_id).append(", frame_num=").append(frame_num).append(", field_pic_flag=").append(field_pic_flag).append(", bottom_field_flag=").append(bottom_field_flag).append(", idr_pic_id=").append(idr_pic_id).append(", pic_order_cnt_lsb=").append(pic_order_cnt_lsb).append(", delta_pic_order_cnt_bottom=").append(delta_pic_order_cnt_bottom).append('}').toString();
    }

    public SliceType(InputStream inputstream, SeqParameterSet seqparameterset, PictureParameterSet pictureparameterset, boolean flag)
        throws IOException
    {
        field_pic_flag = false;
        bottom_field_flag = false;
        inputstream.read();
        inputstream = new CAVLCReader(inputstream);
        first_mb_in_slice = inputstream.readUE("SliceHeader: first_mb_in_slice");
        inputstream.readUE("SliceHeader: slice_type");
        JVM INSTR tableswitch 0 9: default 100
    //                   0 241
    //                   1 251
    //                   2 261
    //                   3 271
    //                   4 281
    //                   5 241
    //                   6 251
    //                   7 261
    //                   8 271
    //                   9 281;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L2 _L3 _L4 _L5 _L6
_L1:
        pic_parameter_set_id = inputstream.readUE("SliceHeader: pic_parameter_set_id");
        if (seqparameterset.residual_color_transform_flag)
        {
            colour_plane_id = inputstream.readU(2, "SliceHeader: colour_plane_id");
        }
        frame_num = inputstream.readU(seqparameterset.log2_max_frame_num_minus4 + 4, "SliceHeader: frame_num");
        if (!seqparameterset.frame_mbs_only_flag)
        {
            field_pic_flag = inputstream.readBool("SliceHeader: field_pic_flag");
            if (field_pic_flag)
            {
                bottom_field_flag = inputstream.readBool("SliceHeader: bottom_field_flag");
            }
        }
        if (flag)
        {
            idr_pic_id = inputstream.readUE("SliceHeader: idr_pic_id");
            if (seqparameterset.pic_order_cnt_type == 0)
            {
                pic_order_cnt_lsb = inputstream.readU(seqparameterset.log2_max_pic_order_cnt_lsb_minus4 + 4, "SliceHeader: pic_order_cnt_lsb");
                if (pictureparameterset.pic_order_present_flag && !field_pic_flag)
                {
                    delta_pic_order_cnt_bottom = inputstream.readSE("SliceHeader: delta_pic_order_cnt_bottom");
                }
            }
        }
        return;
_L2:
        slice_type = SliceType.P;
        continue; /* Loop/switch isn't completed */
_L3:
        slice_type = SliceType.B;
        continue; /* Loop/switch isn't completed */
_L4:
        slice_type = SliceType.I;
        continue; /* Loop/switch isn't completed */
_L5:
        slice_type = SliceType.SP;
        continue; /* Loop/switch isn't completed */
_L6:
        slice_type = SliceType.SI;
        if (true) goto _L1; else goto _L7
_L7:
    }
}

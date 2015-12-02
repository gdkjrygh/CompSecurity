// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.h264.model.ChromaFormat;
import com.googlecode.mp4parser.h264.model.HRDParameters;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.model.VUIParameters;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class H264TrackImpl extends AbstractTrack
{
    public class ByteBufferBackedInputStream extends InputStream
    {

        private final ByteBuffer buf;
        final H264TrackImpl this$0;

        public int read()
            throws IOException
        {
            if (!buf.hasRemaining())
            {
                return -1;
            } else
            {
                return buf.get() & 0xff;
            }
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            if (!buf.hasRemaining())
            {
                return -1;
            } else
            {
                j = Math.min(j, buf.remaining());
                buf.get(abyte0, i, j);
                return j;
            }
        }

        public ByteBufferBackedInputStream(ByteBuffer bytebuffer)
        {
            this$0 = H264TrackImpl.this;
            super();
            buf = bytebuffer.duplicate();
        }
    }

    protected class CleanInputStream extends FilterInputStream
    {

        int prev;
        int prevprev;
        final H264TrackImpl this$0;

        public boolean markSupported()
        {
            return false;
        }

        public int read()
            throws IOException
        {
            int j = super.read();
            int i = j;
            if (j == 3)
            {
                i = j;
                if (prevprev == 0)
                {
                    i = j;
                    if (prev == 0)
                    {
                        prevprev = -1;
                        prev = -1;
                        i = super.read();
                    }
                }
            }
            prevprev = prev;
            prev = i;
            return i;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            if (abyte0 == null)
            {
                throw new NullPointerException();
            }
            if (i < 0 || j < 0 || j > abyte0.length - i)
            {
                throw new IndexOutOfBoundsException();
            }
            if (j != 0) goto _L2; else goto _L1
_L1:
            int l = 0;
_L4:
            return l;
_L2:
            int k;
            k = read();
            if (k == -1)
            {
                return -1;
            }
            abyte0[i] = (byte)k;
            k = 1;
_L6:
            l = k;
            if (k >= j) goto _L4; else goto _L3
_L3:
            int i1;
            try
            {
                i1 = read();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return k;
            }
            l = k;
            if (i1 == -1) goto _L4; else goto _L5
_L5:
            abyte0[i + k] = (byte)i1;
            k++;
              goto _L6
        }

        CleanInputStream(InputStream inputstream)
        {
            this$0 = H264TrackImpl.this;
            super(inputstream);
            prevprev = -1;
            prev = -1;
        }
    }

    private static final class NALActions extends Enum
    {

        public static final NALActions BUFFER;
        public static final NALActions END;
        private static final NALActions ENUM$VALUES[];
        public static final NALActions IGNORE;
        public static final NALActions STORE;

        public static NALActions valueOf(String s)
        {
            return (NALActions)Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl$NALActions, s);
        }

        public static NALActions[] values()
        {
            NALActions analactions[] = ENUM$VALUES;
            int i = analactions.length;
            NALActions analactions1[] = new NALActions[i];
            System.arraycopy(analactions, 0, analactions1, 0, i);
            return analactions1;
        }

        static 
        {
            IGNORE = new NALActions("IGNORE", 0);
            BUFFER = new NALActions("BUFFER", 1);
            STORE = new NALActions("STORE", 2);
            END = new NALActions("END", 3);
            ENUM$VALUES = (new NALActions[] {
                IGNORE, BUFFER, STORE, END
            });
        }

        private NALActions(String s, int i)
        {
            super(s, i);
        }
    }

    private class ReaderWrapper
    {

        final MappedByteBuffer buffer;
        final H264TrackImpl this$0;

        int get()
            throws IOException
        {
            return buffer.get();
        }

        public long getPos()
            throws IOException
        {
            return (long)buffer.position();
        }

        boolean hasRemaining()
        {
            return buffer.hasRemaining();
        }

        ByteBuffer map(int i)
            throws IOException
        {
            ByteBuffer bytebuffer = buffer.duplicate();
            bytebuffer.position(buffer.position());
            bytebuffer.limit(bytebuffer.position() + i);
            buffer.position(buffer.position() + i);
            return bytebuffer;
        }

        public void mark()
            throws IOException
        {
            buffer.mark();
        }

        public void reset()
            throws IOException
        {
            buffer.reset();
        }

        void seek(int i)
            throws IOException
        {
            buffer.position(buffer.position() + i);
        }

        private ReaderWrapper(FileChannel filechannel)
            throws IOException
        {
            this$0 = H264TrackImpl.this;
            super();
            buffer = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, filechannel.position(), filechannel.size() - filechannel.position());
        }

        ReaderWrapper(FileChannel filechannel, ReaderWrapper readerwrapper)
            throws IOException
        {
            this(filechannel);
        }
    }

    public class SEIMessage
    {

        boolean clock_timestamp_flag;
        int cnt_dropped_flag;
        int counting_type;
        int cpb_removal_delay;
        int ct_type;
        int discontinuity_flag;
        int dpb_removal_delay;
        int full_timestamp_flag;
        int hours_value;
        int minutes_value;
        int n_frames;
        int nuit_field_based_flag;
        int payloadSize;
        int payloadType;
        int pic_struct;
        boolean removal_delay_flag;
        int seconds_value;
        SeqParameterSet sps;
        final H264TrackImpl this$0;
        int time_offset;
        int time_offset_length;

        public String toString()
        {
            String s;
label0:
            {
                String s1;
label1:
                {
                    String s2 = (new StringBuilder("SEIMessage{payloadType=")).append(payloadType).append(", payloadSize=").append(payloadSize).toString();
                    s = s2;
                    if (payloadType != 1)
                    {
                        break label0;
                    }
                    if (sps.vuiParams.nalHRDParams == null)
                    {
                        s1 = s2;
                        if (sps.vuiParams.vclHRDParams == null)
                        {
                            break label1;
                        }
                    }
                    s1 = (new StringBuilder(String.valueOf(s2))).append(", cpb_removal_delay=").append(cpb_removal_delay).append(", dpb_removal_delay=").append(dpb_removal_delay).toString();
                }
                s = s1;
                if (sps.vuiParams.pic_struct_present_flag)
                {
                    s1 = (new StringBuilder(String.valueOf(s1))).append(", pic_struct=").append(pic_struct).toString();
                    s = s1;
                    if (clock_timestamp_flag)
                    {
                        s = (new StringBuilder(String.valueOf(s1))).append(", ct_type=").append(ct_type).append(", nuit_field_based_flag=").append(nuit_field_based_flag).append(", counting_type=").append(counting_type).append(", full_timestamp_flag=").append(full_timestamp_flag).append(", discontinuity_flag=").append(discontinuity_flag).append(", cnt_dropped_flag=").append(cnt_dropped_flag).append(", n_frames=").append(n_frames).append(", seconds_value=").append(seconds_value).append(", minutes_value=").append(minutes_value).append(", hours_value=").append(hours_value).append(", time_offset_length=").append(time_offset_length).append(", time_offset=").append(time_offset).toString();
                    }
                }
            }
            return (new StringBuilder(String.valueOf(s))).append('}').toString();
        }

        public SEIMessage(InputStream inputstream, SeqParameterSet seqparameterset)
            throws IOException
        {
            int i;
            int i1;
            this$0 = H264TrackImpl.this;
            super();
            payloadType = 0;
            payloadSize = 0;
            sps = seqparameterset;
            inputstream.read();
            i1 = inputstream.available();
            i = 0;
_L16:
            int j;
            if (i >= i1)
            {
                return;
            }
            payloadType = 0;
            payloadSize = 0;
            j = inputstream.read();
            i++;
_L17:
            if (j == 255) goto _L2; else goto _L1
_L1:
            payloadType = payloadType + j;
            j = inputstream.read();
            i++;
_L18:
            if (j == 255) goto _L4; else goto _L3
_L3:
            payloadSize = payloadSize + j;
            if (i1 - i < payloadSize)
            {
                break MISSING_BLOCK_LABEL_834;
            }
            if (payloadType != 1) goto _L6; else goto _L5
_L5:
            if (seqparameterset.vuiParams == null || seqparameterset.vuiParams.nalHRDParams == null && seqparameterset.vuiParams.vclHRDParams == null && !seqparameterset.vuiParams.pic_struct_present_flag) goto _L8; else goto _L7
_L7:
            h264trackimpl = new byte[payloadSize];
            inputstream.read(H264TrackImpl.this);
            int k = i + payloadSize;
            h264trackimpl = new CAVLCReader(new ByteArrayInputStream(H264TrackImpl.this));
            if (seqparameterset.vuiParams.nalHRDParams != null || seqparameterset.vuiParams.vclHRDParams != null)
            {
                removal_delay_flag = true;
                cpb_removal_delay = readU(seqparameterset.vuiParams.nalHRDParams.cpb_removal_delay_length_minus1 + 1, "SEI: cpb_removal_delay");
                dpb_removal_delay = readU(seqparameterset.vuiParams.nalHRDParams.dpb_output_delay_length_minus1 + 1, "SEI: dpb_removal_delay");
            } else
            {
                removal_delay_flag = false;
            }
            i = k;
            if (!seqparameterset.vuiParams.pic_struct_present_flag) goto _L10; else goto _L9
_L9:
            pic_struct = readU(4, "SEI: pic_struct");
            pic_struct;
            JVM INSTR tableswitch 3 8: default 348
        //                       3 438
        //                       4 438
        //                       5 444
        //                       6 444
        //                       7 438
        //                       8 444;
               goto _L11 _L12 _L12 _L13 _L13 _L12 _L13
_L11:
            i = 1;
_L19:
            j = 0;
_L20:
            if (j < i) goto _L15; else goto _L14
_L14:
            i = k;
_L10:
            H264TrackImpl.LOG.fine(toString());
              goto _L16
_L2:
            payloadType = payloadType + j;
            j = inputstream.read();
            i++;
              goto _L17
_L4:
            payloadSize = payloadSize + j;
            j = inputstream.read();
            i++;
              goto _L18
_L12:
            i = 2;
              goto _L19
_L13:
            i = 3;
              goto _L19
_L15:
            clock_timestamp_flag = readBool((new StringBuilder("pic_timing SEI: clock_timestamp_flag[")).append(j).append("]").toString());
            if (clock_timestamp_flag)
            {
                ct_type = readU(2, "pic_timing SEI: ct_type");
                nuit_field_based_flag = readU(1, "pic_timing SEI: nuit_field_based_flag");
                counting_type = readU(5, "pic_timing SEI: counting_type");
                full_timestamp_flag = readU(1, "pic_timing SEI: full_timestamp_flag");
                discontinuity_flag = readU(1, "pic_timing SEI: discontinuity_flag");
                cnt_dropped_flag = readU(1, "pic_timing SEI: cnt_dropped_flag");
                n_frames = readU(8, "pic_timing SEI: n_frames");
                if (full_timestamp_flag == 1)
                {
                    seconds_value = readU(6, "pic_timing SEI: seconds_value");
                    minutes_value = readU(6, "pic_timing SEI: minutes_value");
                    hours_value = readU(5, "pic_timing SEI: hours_value");
                } else
                if (readBool("pic_timing SEI: seconds_flag"))
                {
                    seconds_value = readU(6, "pic_timing SEI: seconds_value");
                    if (readBool("pic_timing SEI: minutes_flag"))
                    {
                        minutes_value = readU(6, "pic_timing SEI: minutes_value");
                        if (readBool("pic_timing SEI: hours_flag"))
                        {
                            hours_value = readU(5, "pic_timing SEI: hours_value");
                        }
                    }
                }
                if (seqparameterset.vuiParams.nalHRDParams != null)
                {
                    time_offset_length = seqparameterset.vuiParams.nalHRDParams.time_offset_length;
                } else
                if (seqparameterset.vuiParams.vclHRDParams != null)
                {
                    time_offset_length = seqparameterset.vuiParams.vclHRDParams.time_offset_length;
                } else
                {
                    time_offset_length = 24;
                }
                time_offset = readU(24, "pic_timing SEI: time_offset");
            }
            j++;
              goto _L20
_L8:
            int l;
            l = 0;
            j = i;
_L22:
            i = j;
            if (l >= payloadSize) goto _L10; else goto _L21
_L21:
            inputstream.read();
            j++;
            l++;
              goto _L22
_L6:
            l = 0;
            j = i;
_L24:
            i = j;
            if (l >= payloadSize) goto _L10; else goto _L23
_L23:
            inputstream.read();
            j++;
            l++;
              goto _L24
            i = i1;
              goto _L10
        }
    }

    public static class SliceHeader
    {

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

        public SliceHeader(InputStream inputstream, SeqParameterSet seqparameterset, PictureParameterSet pictureparameterset, boolean flag)
            throws IOException
        {
            field_pic_flag = false;
            bottom_field_flag = false;
            inputstream.read();
            inputstream = new CAVLCReader(inputstream);
            first_mb_in_slice = inputstream.readUE("SliceHeader: first_mb_in_slice");
            inputstream.readUE("SliceHeader: slice_type");
            JVM INSTR tableswitch 0 9: default 100
        //                       0 241
        //                       1 251
        //                       2 261
        //                       3 271
        //                       4 281
        //                       5 241
        //                       6 251
        //                       7 261
        //                       8 271
        //                       9 281;
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

    public static final class SliceHeader.SliceType extends Enum
    {

        public static final SliceHeader.SliceType B;
        private static final SliceHeader.SliceType ENUM$VALUES[];
        public static final SliceHeader.SliceType I;
        public static final SliceHeader.SliceType P;
        public static final SliceHeader.SliceType SI;
        public static final SliceHeader.SliceType SP;

        public static SliceHeader.SliceType valueOf(String s)
        {
            return (SliceHeader.SliceType)Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader$SliceType, s);
        }

        public static SliceHeader.SliceType[] values()
        {
            SliceHeader.SliceType aslicetype[] = ENUM$VALUES;
            int i = aslicetype.length;
            SliceHeader.SliceType aslicetype1[] = new SliceHeader.SliceType[i];
            System.arraycopy(aslicetype, 0, aslicetype1, 0, i);
            return aslicetype1;
        }

        static 
        {
            P = new SliceHeader.SliceType("P", 0);
            B = new SliceHeader.SliceType("B", 1);
            I = new SliceHeader.SliceType("I", 2);
            SP = new SliceHeader.SliceType("SP", 3);
            SI = new SliceHeader.SliceType("SI", 4);
            ENUM$VALUES = (new SliceHeader.SliceType[] {
                P, B, I, SP, SI
            });
        }

        private SliceHeader.SliceType(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[];
    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl.getName());
    List ctts;
    private int currentScSize;
    private boolean determineFrameRate;
    int frameNrInGop;
    private int frametick;
    private int height;
    private String lang;
    PictureParameterSet pictureParameterSet;
    LinkedList pictureParameterSetList;
    private int prevScSize;
    boolean readSamples;
    private ReaderWrapper reader;
    SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    List sdtp;
    private SEIMessage seiMessage;
    SeqParameterSet seqParameterSet;
    LinkedList seqParameterSetList;
    List stss;
    List stts;
    private long timescale;
    TrackMetaData trackMetaData;
    private int width;

    static int[] $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions()
    {
        int ai[] = $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[NALActions.values().length];
        try
        {
            ai[NALActions.BUFFER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[NALActions.END.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[NALActions.IGNORE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[NALActions.STORE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions = ai;
        return ai;
    }

    public H264TrackImpl(FileChannel filechannel)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        readSamples = false;
        seqParameterSet = null;
        pictureParameterSet = null;
        seqParameterSetList = new LinkedList();
        pictureParameterSetList = new LinkedList();
        frameNrInGop = 0;
        determineFrameRate = true;
        lang = "eng";
        parse(filechannel);
    }

    public H264TrackImpl(FileChannel filechannel, String s)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        readSamples = false;
        seqParameterSet = null;
        pictureParameterSet = null;
        seqParameterSetList = new LinkedList();
        pictureParameterSetList = new LinkedList();
        frameNrInGop = 0;
        determineFrameRate = true;
        lang = "eng";
        lang = s;
        parse(filechannel);
    }

    public H264TrackImpl(FileChannel filechannel, String s, long l, int i)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        readSamples = false;
        seqParameterSet = null;
        pictureParameterSet = null;
        seqParameterSetList = new LinkedList();
        pictureParameterSetList = new LinkedList();
        frameNrInGop = 0;
        determineFrameRate = true;
        lang = "eng";
        lang = s;
        timescale = l;
        frametick = i;
        if (l > 0L && i > 0)
        {
            determineFrameRate = false;
        }
        parse(filechannel);
    }

    private void configureFramerate()
    {
label0:
        {
            if (determineFrameRate)
            {
                if (seqParameterSet.vuiParams == null)
                {
                    break label0;
                }
                timescale = seqParameterSet.vuiParams.time_scale >> 1;
                frametick = seqParameterSet.vuiParams.num_units_in_tick;
                if (timescale == 0L || frametick == 0)
                {
                    System.err.println((new StringBuilder("Warning: vuiParams contain invalid values: time_scale: ")).append(timescale).append(" and frame_tick: ").append(frametick).append(". Setting frame rate to 25fps").toString());
                    timescale = 0x15f90L;
                    frametick = 3600;
                }
            }
            return;
        }
        System.err.println("Warning: Can't determine frame rate. Guessing 25 fps");
        timescale = 0x15f90L;
        frametick = 3600;
    }

    private boolean findNextStartcode()
        throws IOException
    {
        byte abyte0[] = new byte[4];
        byte[] _tmp = abyte0;
        abyte0[0] = -1;
        abyte0[1] = -1;
        abyte0[2] = -1;
        abyte0[3] = -1;
        do
        {
            if (!reader.hasRemaining())
            {
                return false;
            }
            abyte0[0] = abyte0[1];
            abyte0[1] = abyte0[2];
            abyte0[2] = abyte0[3];
            abyte0[3] = (byte)reader.get();
            if (abyte0[0] == 0 && abyte0[1] == 0 && abyte0[2] == 0 && abyte0[3] == 1)
            {
                prevScSize = currentScSize;
                currentScSize = 4;
                return true;
            }
        } while (abyte0[0] != 0 || abyte0[1] != 0 || abyte0[2] != 1);
        prevScSize = currentScSize;
        currentScSize = 3;
        return true;
    }

    private NALActions handleNALUnit(int i, int j, ByteBuffer bytebuffer)
        throws IOException
    {
        switch (j)
        {
        default:
            System.err.println((new StringBuilder("Unknown NAL unit type: ")).append(j).toString());
            return NALActions.IGNORE;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return NALActions.STORE;

        case 6: // '\006'
            seiMessage = new SEIMessage(cleanBuffer(new ByteBufferBackedInputStream(bytebuffer)), seqParameterSet);
            return NALActions.BUFFER;

        case 9: // '\t'
            i = bytebuffer.get(bytebuffer.position() + 1);
            LOG.fine((new StringBuilder("Access unit delimiter type: ")).append(i >> 5).toString());
            return NALActions.BUFFER;

        case 7: // '\007'
            if (seqParameterSet == null)
            {
                InputStream inputstream = cleanBuffer(new ByteBufferBackedInputStream(bytebuffer));
                inputstream.read();
                seqParameterSet = SeqParameterSet.read(inputstream);
                seqParameterSetList.add(toArray(bytebuffer));
                configureFramerate();
            }
            return NALActions.IGNORE;

        case 8: // '\b'
            if (pictureParameterSet == null)
            {
                ByteBufferBackedInputStream bytebufferbackedinputstream = new ByteBufferBackedInputStream(bytebuffer);
                bytebufferbackedinputstream.read();
                pictureParameterSet = PictureParameterSet.read(bytebufferbackedinputstream);
                pictureParameterSetList.add(toArray(bytebuffer));
            }
            return NALActions.IGNORE;

        case 10: // '\n'
        case 11: // '\013'
            return NALActions.END;
        }
    }

    private void parse(FileChannel filechannel)
        throws IOException
    {
        reader = new ReaderWrapper(filechannel, null);
        stts = new LinkedList();
        ctts = new LinkedList();
        sdtp = new LinkedList();
        stss = new LinkedList();
        samples = new LinkedList();
        if (!readSamples())
        {
            throw new IOException();
        }
        if (!readVariables())
        {
            throw new IOException();
        } else
        {
            sampleDescriptionBox = new SampleDescriptionBox();
            filechannel = new VisualSampleEntry("avc1");
            filechannel.setDataReferenceIndex(1);
            filechannel.setDepth(24);
            filechannel.setFrameCount(1);
            filechannel.setHorizresolution(72D);
            filechannel.setVertresolution(72D);
            filechannel.setWidth(width);
            filechannel.setHeight(height);
            filechannel.setCompressorname("AVC Coding");
            AvcConfigurationBox avcconfigurationbox = new AvcConfigurationBox();
            avcconfigurationbox.setSequenceParameterSets(seqParameterSetList);
            avcconfigurationbox.setPictureParameterSets(pictureParameterSetList);
            avcconfigurationbox.setAvcLevelIndication(seqParameterSet.level_idc);
            avcconfigurationbox.setAvcProfileIndication(seqParameterSet.profile_idc);
            avcconfigurationbox.setBitDepthLumaMinus8(seqParameterSet.bit_depth_luma_minus8);
            avcconfigurationbox.setBitDepthChromaMinus8(seqParameterSet.bit_depth_chroma_minus8);
            avcconfigurationbox.setChromaFormat(seqParameterSet.chroma_format_idc.getId());
            avcconfigurationbox.setConfigurationVersion(1);
            avcconfigurationbox.setLengthSizeMinusOne(3);
            avcconfigurationbox.setProfileCompatibility(((byte[])seqParameterSetList.get(0))[1]);
            filechannel.addBox(avcconfigurationbox);
            sampleDescriptionBox.addBox(filechannel);
            trackMetaData.setCreationTime(new Date());
            trackMetaData.setModificationTime(new Date());
            trackMetaData.setLanguage(lang);
            trackMetaData.setTimescale(timescale);
            trackMetaData.setWidth(width);
            trackMetaData.setHeight(height);
            return;
        }
    }

    private boolean readSamples()
        throws IOException
    {
        Object obj;
        int i;
        long l1;
        if (readSamples)
        {
            return true;
        }
        readSamples = true;
        findNextStartcode();
        reader.mark();
        l1 = reader.getPos();
        obj = new ArrayList();
        i = 0;
_L7:
        ArrayList arraylist;
        ByteBuffer bytebuffer;
        NALActions nalactions;
        int j;
        int l;
        long l2;
        if (!findNextStartcode())
        {
            return true;
        }
        l2 = reader.getPos();
        j = (int)(l2 - l1 - (long)prevScSize);
        reader.reset();
        bytebuffer = reader.map(j);
        j = bytebuffer.get(bytebuffer.position());
        l = j & 0x1f;
        nalactions = handleNALUnit(j >> 5 & 3, l, bytebuffer);
        arraylist = ((ArrayList) (obj));
        j = i;
        $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions()[nalactions.ordinal()];
        JVM INSTR tableswitch 1 4: default 172
    //                   1 178
    //                   2 209
    //                   3 226
    //                   4 557;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_557;
_L3:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j = i;
        arraylist = ((ArrayList) (obj));
_L8:
        l1 = l2;
        reader.seek(currentScSize);
        reader.mark();
        obj = arraylist;
        i = j;
        if (true) goto _L7; else goto _L6
_L6:
        ((List) (obj)).add(bytebuffer);
        arraylist = ((ArrayList) (obj));
        j = i;
          goto _L8
_L4:
        j = 22;
        int k = i + 1;
        ((List) (obj)).add(bytebuffer);
        boolean flag = false;
        i = j;
        if (l == 5)
        {
            i = 22 + 16;
            flag = true;
        }
        j = i;
        if ((new SliceHeader(cleanBuffer(new ByteBufferBackedInputStream((ByteBuffer)((List) (obj)).get(((List) (obj)).size() - 1))), seqParameterSet, pictureParameterSet, flag)).slice_type == SliceHeader.SliceType.B)
        {
            j = i + 4;
        }
        obj = createSample(((List) (obj)));
        arraylist = new ArrayList();
        samples.add(obj);
        stts.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, frametick));
        if (l == 5)
        {
            stss.add(Integer.valueOf(k));
        }
        if (seiMessage == null || seiMessage.n_frames == 0)
        {
            frameNrInGop = 0;
        }
        l = 0;
        if (seiMessage != null && seiMessage.clock_timestamp_flag)
        {
            i = seiMessage.n_frames - frameNrInGop;
        } else
        {
            i = l;
            if (seiMessage != null)
            {
                i = l;
                if (seiMessage.removal_delay_flag)
                {
                    i = seiMessage.dpb_removal_delay / 2;
                }
            }
        }
        ctts.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(1, frametick * i));
        sdtp.add(new com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry(j));
        frameNrInGop = frameNrInGop + 1;
        j = k;
          goto _L8
        return true;
          goto _L8
    }

    private boolean readVariables()
    {
        width = (seqParameterSet.pic_width_in_mbs_minus1 + 1) * 16;
        byte byte0 = 2;
        if (seqParameterSet.frame_mbs_only_flag)
        {
            byte0 = 1;
        }
        height = (seqParameterSet.pic_height_in_map_units_minus1 + 1) * 16 * byte0;
        if (seqParameterSet.frame_cropping_flag)
        {
            int i = 0;
            if (!seqParameterSet.residual_color_transform_flag)
            {
                i = seqParameterSet.chroma_format_idc.getId();
            }
            int k = 1;
            int j = byte0;
            if (i != 0)
            {
                k = seqParameterSet.chroma_format_idc.getSubWidth();
                j = seqParameterSet.chroma_format_idc.getSubHeight() * byte0;
            }
            width = width - (seqParameterSet.frame_crop_left_offset + seqParameterSet.frame_crop_right_offset) * k;
            height = height - (seqParameterSet.frame_crop_top_offset + seqParameterSet.frame_crop_bottom_offset) * j;
        }
        return true;
    }

    static byte[] toArray(ByteBuffer bytebuffer)
    {
        bytebuffer = bytebuffer.duplicate();
        byte abyte0[] = new byte[bytebuffer.remaining()];
        bytebuffer.get(abyte0, 0, abyte0.length);
        return abyte0;
    }

    protected InputStream cleanBuffer(InputStream inputstream)
    {
        return new CleanInputStream(inputstream);
    }

    protected InputStream cleanBuffer(byte abyte0[])
    {
        return cleanBuffer(((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    protected Sample createSample(List list)
    {
        byte abyte0[];
        ByteBuffer abytebuffer[];
        Iterator iterator;
        abyte0 = new byte[list.size() * 4];
        abytebuffer = ByteBuffer.wrap(abyte0);
        iterator = list.iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int i;
        abytebuffer = new ByteBuffer[list.size() * 2];
        i = 0;
_L4:
        if (i >= list.size())
        {
            return new SampleImpl(abytebuffer);
        }
        break MISSING_BLOCK_LABEL_90;
_L2:
        abytebuffer.putInt(((ByteBuffer)iterator.next()).remaining());
          goto _L3
        abytebuffer[i * 2] = ByteBuffer.wrap(abyte0, i * 4, 4);
        abytebuffer[i * 2 + 1] = (ByteBuffer)list.get(i);
        i++;
          goto _L4
    }

    public List getCompositionTimeEntries()
    {
        return ctts;
    }

    public List getDecodingTimeEntries()
    {
        return stts;
    }

    public String getHandler()
    {
        return "vide";
    }

    public AbstractMediaHeaderBox getMediaHeaderBox()
    {
        return new VideoMediaHeaderBox();
    }

    public volatile Box getMediaHeaderBox()
    {
        return getMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        return sdtp;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return null;
    }

    public long[] getSyncSamples()
    {
        long al[] = new long[stss.size()];
        int i = 0;
        do
        {
            if (i >= stss.size())
            {
                return al;
            }
            al[i] = ((Integer)stss.get(i)).intValue();
            i++;
        } while (true);
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }

    public void printAccessUnitDelimiter(byte abyte0[])
    {
        LOG.fine((new StringBuilder("Access unit delimiter: ")).append(abyte0[1] >> 5).toString());
    }



    // Unreferenced inner class com/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1

/* anonymous class */
    static class _cls1
    {

        static final int $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[];

        static 
        {
            $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions = new int[NALActions.values().length];
            try
            {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.IGNORE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.BUFFER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.STORE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.END.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

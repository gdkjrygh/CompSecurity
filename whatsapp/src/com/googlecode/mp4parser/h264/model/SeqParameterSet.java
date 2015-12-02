// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.googlecode.mp4parser.h264.model:
//            BitstreamElement, VUIParameters, AspectRatio, ChromaFormat, 
//            HRDParameters, ScalingMatrix, ScalingList

public class SeqParameterSet extends BitstreamElement
{

    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public ChromaFormat chroma_format_idc;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public boolean constraint_set_4_flag;
    public boolean constraint_set_5_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean direct_8x8_inference_flag;
    public boolean entropy_coding_mode_flag;
    public boolean field_pic_flag;
    public int frame_crop_bottom_offset;
    public int frame_crop_left_offset;
    public int frame_crop_right_offset;
    public int frame_crop_top_offset;
    public boolean frame_cropping_flag;
    public boolean frame_mbs_only_flag;
    public boolean gaps_in_frame_num_value_allowed_flag;
    public int level_idc;
    public int log2_max_frame_num_minus4;
    public int log2_max_pic_order_cnt_lsb_minus4;
    public boolean mb_adaptive_frame_field_flag;
    public int num_ref_frames;
    public int num_ref_frames_in_pic_order_cnt_cycle;
    public int offsetForRefFrame[];
    public int offset_for_non_ref_pic;
    public int offset_for_top_to_bottom_field;
    public int pic_height_in_map_units_minus1;
    public int pic_order_cnt_type;
    public int pic_width_in_mbs_minus1;
    public int profile_idc;
    public boolean qpprime_y_zero_transform_bypass_flag;
    public boolean residual_color_transform_flag;
    public ScalingMatrix scalingMatrix;
    public int seq_parameter_set_id;
    public VUIParameters vuiParams;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    public SeqParameterSet()
    {
    }

    private static VUIParameters ReadVUIParameters(CAVLCReader cavlcreader)
        throws IOException
    {
        VUIParameters vuiparameters = new VUIParameters();
        vuiparameters.aspect_ratio_info_present_flag = cavlcreader.readBool("VUI: aspect_ratio_info_present_flag");
        if (vuiparameters.aspect_ratio_info_present_flag)
        {
            vuiparameters.aspect_ratio = AspectRatio.fromValue((int)cavlcreader.readNBit(8, "VUI: aspect_ratio"));
            if (vuiparameters.aspect_ratio == AspectRatio.Extended_SAR)
            {
                vuiparameters.sar_width = (int)cavlcreader.readNBit(16, "VUI: sar_width");
                vuiparameters.sar_height = (int)cavlcreader.readNBit(16, "VUI: sar_height");
            }
        }
        vuiparameters.overscan_info_present_flag = cavlcreader.readBool("VUI: overscan_info_present_flag");
        if (vuiparameters.overscan_info_present_flag)
        {
            vuiparameters.overscan_appropriate_flag = cavlcreader.readBool("VUI: overscan_appropriate_flag");
        }
        vuiparameters.video_signal_type_present_flag = cavlcreader.readBool("VUI: video_signal_type_present_flag");
        if (vuiparameters.video_signal_type_present_flag)
        {
            vuiparameters.video_format = (int)cavlcreader.readNBit(3, "VUI: video_format");
            vuiparameters.video_full_range_flag = cavlcreader.readBool("VUI: video_full_range_flag");
            vuiparameters.colour_description_present_flag = cavlcreader.readBool("VUI: colour_description_present_flag");
            if (vuiparameters.colour_description_present_flag)
            {
                vuiparameters.colour_primaries = (int)cavlcreader.readNBit(8, "VUI: colour_primaries");
                vuiparameters.transfer_characteristics = (int)cavlcreader.readNBit(8, "VUI: transfer_characteristics");
                vuiparameters.matrix_coefficients = (int)cavlcreader.readNBit(8, "VUI: matrix_coefficients");
            }
        }
        vuiparameters.chroma_loc_info_present_flag = cavlcreader.readBool("VUI: chroma_loc_info_present_flag");
        if (vuiparameters.chroma_loc_info_present_flag)
        {
            vuiparameters.chroma_sample_loc_type_top_field = cavlcreader.readUE("VUI chroma_sample_loc_type_top_field");
            vuiparameters.chroma_sample_loc_type_bottom_field = cavlcreader.readUE("VUI chroma_sample_loc_type_bottom_field");
        }
        vuiparameters.timing_info_present_flag = cavlcreader.readBool("VUI: timing_info_present_flag");
        if (vuiparameters.timing_info_present_flag)
        {
            vuiparameters.num_units_in_tick = (int)cavlcreader.readNBit(32, "VUI: num_units_in_tick");
            vuiparameters.time_scale = (int)cavlcreader.readNBit(32, "VUI: time_scale");
            vuiparameters.fixed_frame_rate_flag = cavlcreader.readBool("VUI: fixed_frame_rate_flag");
        }
        boolean flag = cavlcreader.readBool("VUI: nal_hrd_parameters_present_flag");
        if (flag)
        {
            vuiparameters.nalHRDParams = readHRDParameters(cavlcreader);
        }
        boolean flag1 = cavlcreader.readBool("VUI: vcl_hrd_parameters_present_flag");
        if (flag1)
        {
            vuiparameters.vclHRDParams = readHRDParameters(cavlcreader);
        }
        if (flag || flag1)
        {
            vuiparameters.low_delay_hrd_flag = cavlcreader.readBool("VUI: low_delay_hrd_flag");
        }
        vuiparameters.pic_struct_present_flag = cavlcreader.readBool("VUI: pic_struct_present_flag");
        if (cavlcreader.readBool("VUI: bitstream_restriction_flag"))
        {
            vuiparameters.bitstreamRestriction = new VUIParameters.BitstreamRestriction();
            vuiparameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag = cavlcreader.readBool("VUI: motion_vectors_over_pic_boundaries_flag");
            vuiparameters.bitstreamRestriction.max_bytes_per_pic_denom = cavlcreader.readUE("VUI max_bytes_per_pic_denom");
            vuiparameters.bitstreamRestriction.max_bits_per_mb_denom = cavlcreader.readUE("VUI max_bits_per_mb_denom");
            vuiparameters.bitstreamRestriction.log2_max_mv_length_horizontal = cavlcreader.readUE("VUI log2_max_mv_length_horizontal");
            vuiparameters.bitstreamRestriction.log2_max_mv_length_vertical = cavlcreader.readUE("VUI log2_max_mv_length_vertical");
            vuiparameters.bitstreamRestriction.num_reorder_frames = cavlcreader.readUE("VUI num_reorder_frames");
            vuiparameters.bitstreamRestriction.max_dec_frame_buffering = cavlcreader.readUE("VUI max_dec_frame_buffering");
        }
        return vuiparameters;
    }

    public static SeqParameterSet read(InputStream inputstream)
        throws IOException
    {
        SeqParameterSet seqparameterset;
        inputstream = new CAVLCReader(inputstream);
        seqparameterset = new SeqParameterSet();
        seqparameterset.profile_idc = (int)inputstream.readNBit(8, "SPS: profile_idc");
        seqparameterset.constraint_set_0_flag = inputstream.readBool("SPS: constraint_set_0_flag");
        seqparameterset.constraint_set_1_flag = inputstream.readBool("SPS: constraint_set_1_flag");
        seqparameterset.constraint_set_2_flag = inputstream.readBool("SPS: constraint_set_2_flag");
        seqparameterset.constraint_set_3_flag = inputstream.readBool("SPS: constraint_set_3_flag");
        seqparameterset.constraint_set_4_flag = inputstream.readBool("SPS: constraint_set_4_flag");
        seqparameterset.constraint_set_5_flag = inputstream.readBool("SPS: constraint_set_5_flag");
        inputstream.readNBit(2, "SPS: reserved_zero_2bits");
        seqparameterset.level_idc = (int)inputstream.readNBit(8, "SPS: level_idc");
        seqparameterset.seq_parameter_set_id = inputstream.readUE("SPS: seq_parameter_set_id");
        if (seqparameterset.profile_idc == 100 || seqparameterset.profile_idc == 110 || seqparameterset.profile_idc == 122 || seqparameterset.profile_idc == 144)
        {
            seqparameterset.chroma_format_idc = ChromaFormat.fromId(inputstream.readUE("SPS: chroma_format_idc"));
            if (seqparameterset.chroma_format_idc == ChromaFormat.YUV_444)
            {
                seqparameterset.residual_color_transform_flag = inputstream.readBool("SPS: residual_color_transform_flag");
            }
            seqparameterset.bit_depth_luma_minus8 = inputstream.readUE("SPS: bit_depth_luma_minus8");
            seqparameterset.bit_depth_chroma_minus8 = inputstream.readUE("SPS: bit_depth_chroma_minus8");
            seqparameterset.qpprime_y_zero_transform_bypass_flag = inputstream.readBool("SPS: qpprime_y_zero_transform_bypass_flag");
            if (inputstream.readBool("SPS: seq_scaling_matrix_present_lag"))
            {
                readScalingListMatrix(inputstream, seqparameterset);
            }
        } else
        {
            seqparameterset.chroma_format_idc = ChromaFormat.YUV_420;
        }
        seqparameterset.log2_max_frame_num_minus4 = inputstream.readUE("SPS: log2_max_frame_num_minus4");
        seqparameterset.pic_order_cnt_type = inputstream.readUE("SPS: pic_order_cnt_type");
        if (seqparameterset.pic_order_cnt_type != 0) goto _L2; else goto _L1
_L1:
        seqparameterset.log2_max_pic_order_cnt_lsb_minus4 = inputstream.readUE("SPS: log2_max_pic_order_cnt_lsb_minus4");
_L4:
        seqparameterset.num_ref_frames = inputstream.readUE("SPS: num_ref_frames");
        seqparameterset.gaps_in_frame_num_value_allowed_flag = inputstream.readBool("SPS: gaps_in_frame_num_value_allowed_flag");
        seqparameterset.pic_width_in_mbs_minus1 = inputstream.readUE("SPS: pic_width_in_mbs_minus1");
        seqparameterset.pic_height_in_map_units_minus1 = inputstream.readUE("SPS: pic_height_in_map_units_minus1");
        seqparameterset.frame_mbs_only_flag = inputstream.readBool("SPS: frame_mbs_only_flag");
        if (!seqparameterset.frame_mbs_only_flag)
        {
            seqparameterset.mb_adaptive_frame_field_flag = inputstream.readBool("SPS: mb_adaptive_frame_field_flag");
        }
        seqparameterset.direct_8x8_inference_flag = inputstream.readBool("SPS: direct_8x8_inference_flag");
        seqparameterset.frame_cropping_flag = inputstream.readBool("SPS: frame_cropping_flag");
        if (seqparameterset.frame_cropping_flag)
        {
            seqparameterset.frame_crop_left_offset = inputstream.readUE("SPS: frame_crop_left_offset");
            seqparameterset.frame_crop_right_offset = inputstream.readUE("SPS: frame_crop_right_offset");
            seqparameterset.frame_crop_top_offset = inputstream.readUE("SPS: frame_crop_top_offset");
            seqparameterset.frame_crop_bottom_offset = inputstream.readUE("SPS: frame_crop_bottom_offset");
        }
        if (inputstream.readBool("SPS: vui_parameters_present_flag"))
        {
            seqparameterset.vuiParams = ReadVUIParameters(inputstream);
        }
        inputstream.readTrailingBits();
        return seqparameterset;
_L2:
        if (seqparameterset.pic_order_cnt_type == 1)
        {
            seqparameterset.delta_pic_order_always_zero_flag = inputstream.readBool("SPS: delta_pic_order_always_zero_flag");
            seqparameterset.offset_for_non_ref_pic = inputstream.readSE("SPS: offset_for_non_ref_pic");
            seqparameterset.offset_for_top_to_bottom_field = inputstream.readSE("SPS: offset_for_top_to_bottom_field");
            seqparameterset.num_ref_frames_in_pic_order_cnt_cycle = inputstream.readUE("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            seqparameterset.offsetForRefFrame = new int[seqparameterset.num_ref_frames_in_pic_order_cnt_cycle];
            int i = 0;
            while (i < seqparameterset.num_ref_frames_in_pic_order_cnt_cycle) 
            {
                seqparameterset.offsetForRefFrame[i] = inputstream.readSE((new StringBuilder("SPS: offsetForRefFrame [")).append(i).append("]").toString());
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static HRDParameters readHRDParameters(CAVLCReader cavlcreader)
        throws IOException
    {
        HRDParameters hrdparameters = new HRDParameters();
        hrdparameters.cpb_cnt_minus1 = cavlcreader.readUE("SPS: cpb_cnt_minus1");
        hrdparameters.bit_rate_scale = (int)cavlcreader.readNBit(4, "HRD: bit_rate_scale");
        hrdparameters.cpb_size_scale = (int)cavlcreader.readNBit(4, "HRD: cpb_size_scale");
        hrdparameters.bit_rate_value_minus1 = new int[hrdparameters.cpb_cnt_minus1 + 1];
        hrdparameters.cpb_size_value_minus1 = new int[hrdparameters.cpb_cnt_minus1 + 1];
        hrdparameters.cbr_flag = new boolean[hrdparameters.cpb_cnt_minus1 + 1];
        int i = 0;
        do
        {
            if (i > hrdparameters.cpb_cnt_minus1)
            {
                hrdparameters.initial_cpb_removal_delay_length_minus1 = (int)cavlcreader.readNBit(5, "HRD: initial_cpb_removal_delay_length_minus1");
                hrdparameters.cpb_removal_delay_length_minus1 = (int)cavlcreader.readNBit(5, "HRD: cpb_removal_delay_length_minus1");
                hrdparameters.dpb_output_delay_length_minus1 = (int)cavlcreader.readNBit(5, "HRD: dpb_output_delay_length_minus1");
                hrdparameters.time_offset_length = (int)cavlcreader.readNBit(5, "HRD: time_offset_length");
                return hrdparameters;
            }
            hrdparameters.bit_rate_value_minus1[i] = cavlcreader.readUE("HRD: bit_rate_value_minus1");
            hrdparameters.cpb_size_value_minus1[i] = cavlcreader.readUE("HRD: cpb_size_value_minus1");
            hrdparameters.cbr_flag[i] = cavlcreader.readBool("HRD: cbr_flag");
            i++;
        } while (true);
    }

    private static void readScalingListMatrix(CAVLCReader cavlcreader, SeqParameterSet seqparameterset)
        throws IOException
    {
        seqparameterset.scalingMatrix = new ScalingMatrix();
        int i = 0;
        do
        {
            if (i >= 8)
            {
                return;
            }
            if (cavlcreader.readBool("SPS: seqScalingListPresentFlag"))
            {
                seqparameterset.scalingMatrix.ScalingList4x4 = new ScalingList[8];
                seqparameterset.scalingMatrix.ScalingList8x8 = new ScalingList[8];
                if (i < 6)
                {
                    seqparameterset.scalingMatrix.ScalingList4x4[i] = ScalingList.read(cavlcreader, 16);
                } else
                {
                    seqparameterset.scalingMatrix.ScalingList8x8[i - 6] = ScalingList.read(cavlcreader, 64);
                }
            }
            i++;
        } while (true);
    }

    private void writeHRDParameters(HRDParameters hrdparameters, CAVLCWriter cavlcwriter)
        throws IOException
    {
        cavlcwriter.writeUE(hrdparameters.cpb_cnt_minus1, "HRD: cpb_cnt_minus1");
        cavlcwriter.writeNBit(hrdparameters.bit_rate_scale, 4, "HRD: bit_rate_scale");
        cavlcwriter.writeNBit(hrdparameters.cpb_size_scale, 4, "HRD: cpb_size_scale");
        int i = 0;
        do
        {
            if (i > hrdparameters.cpb_cnt_minus1)
            {
                cavlcwriter.writeNBit(hrdparameters.initial_cpb_removal_delay_length_minus1, 5, "HRD: initial_cpb_removal_delay_length_minus1");
                cavlcwriter.writeNBit(hrdparameters.cpb_removal_delay_length_minus1, 5, "HRD: cpb_removal_delay_length_minus1");
                cavlcwriter.writeNBit(hrdparameters.dpb_output_delay_length_minus1, 5, "HRD: dpb_output_delay_length_minus1");
                cavlcwriter.writeNBit(hrdparameters.time_offset_length, 5, "HRD: time_offset_length");
                return;
            }
            cavlcwriter.writeUE(hrdparameters.bit_rate_value_minus1[i], "HRD: ");
            cavlcwriter.writeUE(hrdparameters.cpb_size_value_minus1[i], "HRD: ");
            cavlcwriter.writeBool(hrdparameters.cbr_flag[i], "HRD: ");
            i++;
        } while (true);
    }

    private void writeVUIParameters(VUIParameters vuiparameters, CAVLCWriter cavlcwriter)
        throws IOException
    {
        boolean flag1 = true;
        cavlcwriter.writeBool(vuiparameters.aspect_ratio_info_present_flag, "VUI: aspect_ratio_info_present_flag");
        if (vuiparameters.aspect_ratio_info_present_flag)
        {
            cavlcwriter.writeNBit(vuiparameters.aspect_ratio.getValue(), 8, "VUI: aspect_ratio");
            if (vuiparameters.aspect_ratio == AspectRatio.Extended_SAR)
            {
                cavlcwriter.writeNBit(vuiparameters.sar_width, 16, "VUI: sar_width");
                cavlcwriter.writeNBit(vuiparameters.sar_height, 16, "VUI: sar_height");
            }
        }
        cavlcwriter.writeBool(vuiparameters.overscan_info_present_flag, "VUI: overscan_info_present_flag");
        if (vuiparameters.overscan_info_present_flag)
        {
            cavlcwriter.writeBool(vuiparameters.overscan_appropriate_flag, "VUI: overscan_appropriate_flag");
        }
        cavlcwriter.writeBool(vuiparameters.video_signal_type_present_flag, "VUI: video_signal_type_present_flag");
        if (vuiparameters.video_signal_type_present_flag)
        {
            cavlcwriter.writeNBit(vuiparameters.video_format, 3, "VUI: video_format");
            cavlcwriter.writeBool(vuiparameters.video_full_range_flag, "VUI: video_full_range_flag");
            cavlcwriter.writeBool(vuiparameters.colour_description_present_flag, "VUI: colour_description_present_flag");
            if (vuiparameters.colour_description_present_flag)
            {
                cavlcwriter.writeNBit(vuiparameters.colour_primaries, 8, "VUI: colour_primaries");
                cavlcwriter.writeNBit(vuiparameters.transfer_characteristics, 8, "VUI: transfer_characteristics");
                cavlcwriter.writeNBit(vuiparameters.matrix_coefficients, 8, "VUI: matrix_coefficients");
            }
        }
        cavlcwriter.writeBool(vuiparameters.chroma_loc_info_present_flag, "VUI: chroma_loc_info_present_flag");
        if (vuiparameters.chroma_loc_info_present_flag)
        {
            cavlcwriter.writeUE(vuiparameters.chroma_sample_loc_type_top_field, "VUI: chroma_sample_loc_type_top_field");
            cavlcwriter.writeUE(vuiparameters.chroma_sample_loc_type_bottom_field, "VUI: chroma_sample_loc_type_bottom_field");
        }
        cavlcwriter.writeBool(vuiparameters.timing_info_present_flag, "VUI: timing_info_present_flag");
        if (vuiparameters.timing_info_present_flag)
        {
            cavlcwriter.writeNBit(vuiparameters.num_units_in_tick, 32, "VUI: num_units_in_tick");
            cavlcwriter.writeNBit(vuiparameters.time_scale, 32, "VUI: time_scale");
            cavlcwriter.writeBool(vuiparameters.fixed_frame_rate_flag, "VUI: fixed_frame_rate_flag");
        }
        boolean flag;
        if (vuiparameters.nalHRDParams != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cavlcwriter.writeBool(flag, "VUI: ");
        if (vuiparameters.nalHRDParams != null)
        {
            writeHRDParameters(vuiparameters.nalHRDParams, cavlcwriter);
        }
        if (vuiparameters.vclHRDParams != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cavlcwriter.writeBool(flag, "VUI: ");
        if (vuiparameters.vclHRDParams != null)
        {
            writeHRDParameters(vuiparameters.vclHRDParams, cavlcwriter);
        }
        if (vuiparameters.nalHRDParams != null || vuiparameters.vclHRDParams != null)
        {
            cavlcwriter.writeBool(vuiparameters.low_delay_hrd_flag, "VUI: low_delay_hrd_flag");
        }
        cavlcwriter.writeBool(vuiparameters.pic_struct_present_flag, "VUI: pic_struct_present_flag");
        if (vuiparameters.bitstreamRestriction != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        cavlcwriter.writeBool(flag, "VUI: ");
        if (vuiparameters.bitstreamRestriction != null)
        {
            cavlcwriter.writeBool(vuiparameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag, "VUI: motion_vectors_over_pic_boundaries_flag");
            cavlcwriter.writeUE(vuiparameters.bitstreamRestriction.max_bytes_per_pic_denom, "VUI: max_bytes_per_pic_denom");
            cavlcwriter.writeUE(vuiparameters.bitstreamRestriction.max_bits_per_mb_denom, "VUI: max_bits_per_mb_denom");
            cavlcwriter.writeUE(vuiparameters.bitstreamRestriction.log2_max_mv_length_horizontal, "VUI: log2_max_mv_length_horizontal");
            cavlcwriter.writeUE(vuiparameters.bitstreamRestriction.log2_max_mv_length_vertical, "VUI: log2_max_mv_length_vertical");
            cavlcwriter.writeUE(vuiparameters.bitstreamRestriction.num_reorder_frames, "VUI: num_reorder_frames");
            cavlcwriter.writeUE(vuiparameters.bitstreamRestriction.max_dec_frame_buffering, "VUI: max_dec_frame_buffering");
        }
    }

    public String toString()
    {
        return (new StringBuilder("SeqParameterSet{ \n        pic_order_cnt_type=")).append(pic_order_cnt_type).append(", \n        field_pic_flag=").append(field_pic_flag).append(", \n        delta_pic_order_always_zero_flag=").append(delta_pic_order_always_zero_flag).append(", \n        weighted_pred_flag=").append(weighted_pred_flag).append(", \n        weighted_bipred_idc=").append(weighted_bipred_idc).append(", \n        entropy_coding_mode_flag=").append(entropy_coding_mode_flag).append(", \n        mb_adaptive_frame_field_flag=").append(mb_adaptive_frame_field_flag).append(", \n        direct_8x8_inference_flag=").append(direct_8x8_inference_flag).append(", \n        chroma_format_idc=").append(chroma_format_idc).append(", \n        log2_max_frame_num_minus4=").append(log2_max_frame_num_minus4).append(", \n        log2_max_pic_order_cnt_lsb_minus4=").append(log2_max_pic_order_cnt_lsb_minus4).append(", \n        pic_height_in_map_units_minus1=").append(pic_height_in_map_units_minus1).append(", \n        pic_width_in_mbs_minus1=").append(pic_width_in_mbs_minus1).append(", \n        bit_depth_luma_minus8=").append(bit_depth_luma_minus8).append(", \n        bit_depth_chroma_minus8=").append(bit_depth_chroma_minus8).append(", \n        qpprime_y_zero_transform_bypass_flag=").append(qpprime_y_zero_transform_bypass_flag).append(", \n        profile_idc=").append(profile_idc).append(", \n        constraint_set_0_flag=").append(constraint_set_0_flag).append(", \n        constraint_set_1_flag=").append(constraint_set_1_flag).append(", \n        constraint_set_2_flag=").append(constraint_set_2_flag).append(", \n        constraint_set_3_flag=").append(constraint_set_3_flag).append(", \n        constraint_set_4_flag=").append(constraint_set_4_flag).append(", \n        constraint_set_5_flag=").append(constraint_set_5_flag).append(", \n        level_idc=").append(level_idc).append(", \n        seq_parameter_set_id=").append(seq_parameter_set_id).append(", \n        residual_color_transform_flag=").append(residual_color_transform_flag).append(", \n        offset_for_non_ref_pic=").append(offset_for_non_ref_pic).append(", \n        offset_for_top_to_bottom_field=").append(offset_for_top_to_bottom_field).append(", \n        num_ref_frames=").append(num_ref_frames).append(", \n        gaps_in_frame_num_value_allowed_flag=").append(gaps_in_frame_num_value_allowed_flag).append(", \n        frame_mbs_only_flag=").append(frame_mbs_only_flag).append(", \n        frame_cropping_flag=").append(frame_cropping_flag).append(", \n        frame_crop_left_offset=").append(frame_crop_left_offset).append(", \n        frame_crop_right_offset=").append(frame_crop_right_offset).append(", \n        frame_crop_top_offset=").append(frame_crop_top_offset).append(", \n        frame_crop_bottom_offset=").append(frame_crop_bottom_offset).append(", \n        offsetForRefFrame=").append(offsetForRefFrame).append(", \n        vuiParams=").append(vuiParams).append(", \n        scalingMatrix=").append(scalingMatrix).append(", \n        num_ref_frames_in_pic_order_cnt_cycle=").append(num_ref_frames_in_pic_order_cnt_cycle).append('}').toString();
    }

    public void write(OutputStream outputstream)
        throws IOException
    {
        boolean flag1;
        flag1 = true;
        outputstream = new CAVLCWriter(outputstream);
        outputstream.writeNBit(profile_idc, 8, "SPS: profile_idc");
        outputstream.writeBool(constraint_set_0_flag, "SPS: constraint_set_0_flag");
        outputstream.writeBool(constraint_set_1_flag, "SPS: constraint_set_1_flag");
        outputstream.writeBool(constraint_set_2_flag, "SPS: constraint_set_2_flag");
        outputstream.writeBool(constraint_set_3_flag, "SPS: constraint_set_3_flag");
        outputstream.writeNBit(0L, 4, "SPS: reserved");
        outputstream.writeNBit(level_idc, 8, "SPS: level_idc");
        outputstream.writeUE(seq_parameter_set_id, "SPS: seq_parameter_set_id");
        if (profile_idc != 100 && profile_idc != 110 && profile_idc != 122 && profile_idc != 144) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag;
        outputstream.writeUE(chroma_format_idc.getId(), "SPS: chroma_format_idc");
        if (chroma_format_idc == ChromaFormat.YUV_444)
        {
            outputstream.writeBool(residual_color_transform_flag, "SPS: residual_color_transform_flag");
        }
        outputstream.writeUE(bit_depth_luma_minus8, "SPS: ");
        outputstream.writeUE(bit_depth_chroma_minus8, "SPS: ");
        outputstream.writeBool(qpprime_y_zero_transform_bypass_flag, "SPS: qpprime_y_zero_transform_bypass_flag");
        if (scalingMatrix != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        outputstream.writeBool(flag, "SPS: ");
        if (scalingMatrix == null) goto _L2; else goto _L3
_L3:
        i = 0;
_L6:
        if (i < 8) goto _L4; else goto _L2
_L2:
        outputstream.writeUE(log2_max_frame_num_minus4, "SPS: log2_max_frame_num_minus4");
        outputstream.writeUE(pic_order_cnt_type, "SPS: pic_order_cnt_type");
        if (pic_order_cnt_type == 0)
        {
            outputstream.writeUE(log2_max_pic_order_cnt_lsb_minus4, "SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else
        if (pic_order_cnt_type == 1)
        {
            outputstream.writeBool(delta_pic_order_always_zero_flag, "SPS: delta_pic_order_always_zero_flag");
            outputstream.writeSE(offset_for_non_ref_pic, "SPS: offset_for_non_ref_pic");
            outputstream.writeSE(offset_for_top_to_bottom_field, "SPS: offset_for_top_to_bottom_field");
            outputstream.writeUE(offsetForRefFrame.length, "SPS: ");
            int j = 0;
            while (j < offsetForRefFrame.length) 
            {
                outputstream.writeSE(offsetForRefFrame[j], "SPS: ");
                j++;
            }
        }
        outputstream.writeUE(num_ref_frames, "SPS: num_ref_frames");
        outputstream.writeBool(gaps_in_frame_num_value_allowed_flag, "SPS: gaps_in_frame_num_value_allowed_flag");
        outputstream.writeUE(pic_width_in_mbs_minus1, "SPS: pic_width_in_mbs_minus1");
        outputstream.writeUE(pic_height_in_map_units_minus1, "SPS: pic_height_in_map_units_minus1");
        outputstream.writeBool(frame_mbs_only_flag, "SPS: frame_mbs_only_flag");
        if (!frame_mbs_only_flag)
        {
            outputstream.writeBool(mb_adaptive_frame_field_flag, "SPS: mb_adaptive_frame_field_flag");
        }
        outputstream.writeBool(direct_8x8_inference_flag, "SPS: direct_8x8_inference_flag");
        outputstream.writeBool(frame_cropping_flag, "SPS: frame_cropping_flag");
        if (frame_cropping_flag)
        {
            outputstream.writeUE(frame_crop_left_offset, "SPS: frame_crop_left_offset");
            outputstream.writeUE(frame_crop_right_offset, "SPS: frame_crop_right_offset");
            outputstream.writeUE(frame_crop_top_offset, "SPS: frame_crop_top_offset");
            outputstream.writeUE(frame_crop_bottom_offset, "SPS: frame_crop_bottom_offset");
        }
        if (vuiParams != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        outputstream.writeBool(flag, "SPS: ");
        if (vuiParams != null)
        {
            writeVUIParameters(vuiParams, outputstream);
        }
        outputstream.writeTrailingBits();
        return;
_L4:
        if (i < 6)
        {
            if (scalingMatrix.ScalingList4x4[i] != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            outputstream.writeBool(flag, "SPS: ");
            if (scalingMatrix.ScalingList4x4[i] != null)
            {
                scalingMatrix.ScalingList4x4[i].write(outputstream);
            }
        } else
        {
            if (scalingMatrix.ScalingList8x8[i - 6] != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            outputstream.writeBool(flag, "SPS: ");
            if (scalingMatrix.ScalingList8x8[i - 6] != null)
            {
                scalingMatrix.ScalingList8x8[i - 6].write(outputstream);
            }
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }
}

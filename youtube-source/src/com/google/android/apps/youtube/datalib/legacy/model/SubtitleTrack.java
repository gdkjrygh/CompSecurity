// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            ab, aa

public final class SubtitleTrack
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    public static final String NO_SUBTITLES_VSS_ID = "-";
    public final int format;
    public final String languageCode;
    public final String languageName;
    public final String offlineSubtitlesPath;
    public final String sourceLanguageCode;
    public final String trackName;
    public final String videoId;
    public final String vssId;

    private SubtitleTrack(Parcel parcel)
    {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
    }

    SubtitleTrack(Parcel parcel, aa aa)
    {
        this(parcel);
    }

    private SubtitleTrack(String s, String s1, String s2, String s3, String s4, int i, String s5, 
            String s6)
    {
        languageCode = (String)c.a(s, "languageCode cannot be null");
        sourceLanguageCode = (String)c.a(s1, "sourceLanguageCode cannot be null");
        languageName = s2;
        trackName = (String)c.a(s3, "trackName cannot be null");
        videoId = s4;
        format = i;
        offlineSubtitlesPath = s5;
        vssId = (String)c.a(s6);
    }

    public static SubtitleTrack create(String s, String s1, String s2, String s3, int i, String s4)
    {
        c.a(s1);
        c.a(s3);
        return new SubtitleTrack(s, s, s1, s2, s3, i, null, s4);
    }

    public static SubtitleTrack createDisableSubtitleOption(String s)
    {
        return new SubtitleTrack("", "", s, "", "", 1, null, "-");
    }

    public static SubtitleTrack createIncomplete(String s, String s1, String s2, int i, String s3)
    {
        return new SubtitleTrack(s, s, s1, s2, null, i, null, s3);
    }

    public static SubtitleTrack createMdx(String s, String s1, String s2, String s3, int i)
    {
        return new SubtitleTrack(s, s, s1, s2, s3, i, null, "-");
    }

    public static SubtitleTrack createOffline(String s, String s1, String s2, String s3, int i, String s4, String s5)
    {
        c.a(s1);
        c.a(s3);
        c.a(s4);
        return new SubtitleTrack(s, s, s1, s2, s3, i, s4, s5);
    }

    public static SubtitleTrack createTranslated(SubtitleTrack subtitletrack, String s)
    {
        c.a(subtitletrack, "fromTrack cannot be null");
        c.a(subtitletrack.videoId, "fromTrack cannot be an incomplete subtitle");
        return new SubtitleTrack(s, subtitletrack.languageCode, null, subtitletrack.trackName, subtitletrack.videoId, subtitletrack.format, null, subtitletrack.vssId);
    }

    public final SubtitleTrack createForOffline(String s)
    {
        return new SubtitleTrack(languageCode, sourceLanguageCode, languageName, trackName, videoId, format, s, vssId);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof SubtitleTrack)
        {
            if (languageCode.equals(((SubtitleTrack) (obj = (SubtitleTrack)obj)).languageCode) && sourceLanguageCode.equals(((SubtitleTrack) (obj)).sourceLanguageCode) && trackName.equals(((SubtitleTrack) (obj)).trackName) && (videoId == null && ((SubtitleTrack) (obj)).videoId == null || videoId.equals(((SubtitleTrack) (obj)).videoId)))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int j = (((languageCode.hashCode() + 527) * 31 + sourceLanguageCode.hashCode()) * 31 + trackName.hashCode()) * 31;
        int i = j;
        if (videoId != null)
        {
            i = j + videoId.hashCode();
        }
        return i;
    }

    public final boolean isAutoTranslated()
    {
        return !sourceLanguageCode.equals(languageCode);
    }

    public final boolean isDisableOption()
    {
        return TextUtils.isEmpty(languageCode);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(languageName);
        if (!TextUtils.isEmpty(trackName) && !trackName.equalsIgnoreCase(languageName))
        {
            stringbuilder.append(" - ").append(trackName);
        }
        if (isAutoTranslated())
        {
            stringbuilder.append("*");
        }
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(languageCode);
        parcel.writeString(sourceLanguageCode);
        parcel.writeString(languageName);
        parcel.writeString(trackName);
        parcel.writeString(videoId);
        parcel.writeInt(format);
        parcel.writeString(offlineSubtitlesPath);
        parcel.writeString(vssId);
    }

}

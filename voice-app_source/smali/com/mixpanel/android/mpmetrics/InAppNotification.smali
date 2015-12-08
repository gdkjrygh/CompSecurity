.class public Lcom/mixpanel/android/mpmetrics/InAppNotification;
.super Ljava/lang/Object;
.source "InAppNotification.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/mixpanel/android/mpmetrics/InAppNotification;",
            ">;"
        }
    .end annotation
.end field

.field private static final FILE_EXTENSION_PATTERN:Ljava/util/regex/Pattern;

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.InAppNotif"


# instance fields
.field private final mBody:Ljava/lang/String;

.field private final mCallToAction:Ljava/lang/String;

.field private final mCallToActionUrl:Ljava/lang/String;

.field private final mDescription:Lorg/json/JSONObject;

.field private final mId:I

.field private mImage:Landroid/graphics/Bitmap;

.field private final mImageUrl:Ljava/lang/String;

.field private final mMessageId:I

.field private final mTitle:Ljava/lang/String;

.field private final mType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 178
    new-instance v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$1;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification$1;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 213
    const-string v0, "(\\.[^./]+$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->FILE_EXTENSION_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 5
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 51
    .local v1, "temp":Lorg/json/JSONObject;
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v1    # "temp":Lorg/json/JSONObject;
    .local v2, "temp":Lorg/json/JSONObject;
    move-object v1, v2

    .line 55
    .end local v2    # "temp":Lorg/json/JSONObject;
    .restart local v1    # "temp":Lorg/json/JSONObject;
    :goto_0
    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mDescription:Lorg/json/JSONObject;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mId:I

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mMessageId:I

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mType:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mTitle:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mBody:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImageUrl:Ljava/lang/String;

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToAction:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToActionUrl:Ljava/lang/String;

    .line 65
    const-class v3, Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImage:Landroid/graphics/Bitmap;

    .line 66
    return-void

    .line 52
    :catch_0
    move-exception v0

    .line 53
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.InAppNotif"

    const-string v4, "Error reading JSON when creating InAppNotification from Parcel"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "description"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
        }
    .end annotation

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    :try_start_0
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mDescription:Lorg/json/JSONObject;

    .line 71
    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mId:I

    .line 72
    const-string v1, "message_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mMessageId:I

    .line 73
    const-string v1, "type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mType:Ljava/lang/String;

    .line 74
    const-string v1, "title"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mTitle:Ljava/lang/String;

    .line 75
    const-string v1, "body"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mBody:Ljava/lang/String;

    .line 76
    const-string v1, "image_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImageUrl:Ljava/lang/String;

    .line 77
    const/16 v1, 0x1f4

    const/16 v2, 0x1f4

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImage:Landroid/graphics/Bitmap;

    .line 80
    const-string v1, "cta"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToAction:Ljava/lang/String;

    .line 81
    const-string v1, "cta_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToActionUrl:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    return-void

    .line 82
    :catch_0
    move-exception v0

    .line 83
    .local v0, "e":Lorg/json/JSONException;
    new-instance v1, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;

    const-string v2, "Notification JSON was unexpected or bad"

    invoke-direct {v1, v2, v0}, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method static sizeSuffixUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "url"    # Ljava/lang/String;
    .param p1, "sizeSuffix"    # Ljava/lang/String;

    .prologue
    .line 192
    sget-object v1, Lcom/mixpanel/android/mpmetrics/InAppNotification;->FILE_EXTENSION_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 193
    .local v0, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 194
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "$1"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 196
    .end local p0    # "url":Ljava/lang/String;
    :cond_0
    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 161
    const/4 v0, 0x0

    return v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mBody:Ljava/lang/String;

    return-object v0
.end method

.method public getCallToAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToAction:Ljava/lang/String;

    return-object v0
.end method

.method public getCallToActionUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToActionUrl:Ljava/lang/String;

    return-object v0
.end method

.method getCampaignProperties()Lorg/json/JSONObject;
    .locals 4

    .prologue
    .line 92
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 94
    .local v1, "ret":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "campaign_id"

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getId()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 95
    const-string v2, "message_id"

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getMessageId()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 96
    const-string v2, "message_type"

    const-string v3, "inapp"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    const-string v2, "message_subtype"

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mType:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    :goto_0
    return-object v1

    .line 98
    :catch_0
    move-exception v0

    .line 99
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "MixpanelAPI.InAppNotif"

    const-string v3, "Impossible JSON Exception"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 106
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mId:I

    return v0
.end method

.method public getImage()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImage:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getImage2xUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImageUrl:Ljava/lang/String;

    const-string v1, "@2x"

    invoke-static {v0, v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->sizeSuffixUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImage4xUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 140
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImageUrl:Ljava/lang/String;

    const-string v1, "@4x"

    invoke-static {v0, v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->sizeSuffixUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageId()I
    .locals 1

    .prologue
    .line 110
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mMessageId:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
    .locals 2

    .prologue
    .line 114
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->MINI:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->MINI:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    .line 120
    :goto_0
    return-object v0

    .line 117
    :cond_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    goto :goto_0

    .line 120
    :cond_1
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->UNKNOWN:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    goto :goto_0
.end method

.method setImage(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "image"    # Landroid/graphics/Bitmap;

    .prologue
    .line 152
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImage:Landroid/graphics/Bitmap;

    .line 153
    return-void
.end method

.method toJSON()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mDescription:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 166
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mDescription:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 167
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mMessageId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 169
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mBody:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToAction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mCallToActionUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppNotification;->mImage:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 176
    return-void
.end method

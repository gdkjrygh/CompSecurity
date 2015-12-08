.class public final Lcom/facebook/share/model/AppInviteContent;
.super Ljava/lang/Object;
.source "AppInviteContent.java"

# interfaces
.implements Lcom/facebook/share/model/ShareModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/model/AppInviteContent$Builder;
    }
.end annotation


# instance fields
.field private final applinkUrl:Ljava/lang/String;

.field private final previewImageUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->applinkUrl:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->previewImageUrl:Ljava/lang/String;

    .line 40
    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/model/AppInviteContent$Builder;)V
    .locals 1
    .param p1, "builder"    # Lcom/facebook/share/model/AppInviteContent$Builder;

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    # getter for: Lcom/facebook/share/model/AppInviteContent$Builder;->applinkUrl:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/AppInviteContent$Builder;->access$3(Lcom/facebook/share/model/AppInviteContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->applinkUrl:Ljava/lang/String;

    .line 34
    # getter for: Lcom/facebook/share/model/AppInviteContent$Builder;->previewImageUrl:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/AppInviteContent$Builder;->access$4(Lcom/facebook/share/model/AppInviteContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->previewImageUrl:Ljava/lang/String;

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/model/AppInviteContent$Builder;Lcom/facebook/share/model/AppInviteContent;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/share/model/AppInviteContent;-><init>(Lcom/facebook/share/model/AppInviteContent$Builder;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    return v0
.end method

.method public getApplinkUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->applinkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getPreviewImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->previewImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->applinkUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/share/model/AppInviteContent;->previewImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 63
    return-void
.end method

.class public final Lcom/facebook/share/model/AppGroupCreationContent;
.super Ljava/lang/Object;
.source "AppGroupCreationContent.java"

# interfaces
.implements Lcom/facebook/share/model/ShareModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;,
        Lcom/facebook/share/model/AppGroupCreationContent$Builder;
    }
.end annotation


# instance fields
.field private final description:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private privacy:Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;


# direct methods
.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->name:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->description:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;

    iput-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->privacy:Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;

    .line 43
    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/model/AppGroupCreationContent$Builder;)V
    .locals 1
    .param p1, "builder"    # Lcom/facebook/share/model/AppGroupCreationContent$Builder;

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    # getter for: Lcom/facebook/share/model/AppGroupCreationContent$Builder;->name:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/AppGroupCreationContent$Builder;->access$3(Lcom/facebook/share/model/AppGroupCreationContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->name:Ljava/lang/String;

    .line 35
    # getter for: Lcom/facebook/share/model/AppGroupCreationContent$Builder;->description:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/AppGroupCreationContent$Builder;->access$4(Lcom/facebook/share/model/AppGroupCreationContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->description:Ljava/lang/String;

    .line 36
    # getter for: Lcom/facebook/share/model/AppGroupCreationContent$Builder;->privacy:Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;
    invoke-static {p1}, Lcom/facebook/share/model/AppGroupCreationContent$Builder;->access$5(Lcom/facebook/share/model/AppGroupCreationContent$Builder;)Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->privacy:Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;

    .line 37
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/model/AppGroupCreationContent$Builder;Lcom/facebook/share/model/AppGroupCreationContent;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/share/model/AppGroupCreationContent;-><init>(Lcom/facebook/share/model/AppGroupCreationContent$Builder;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public getAppGroupPrivacy()Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->privacy:Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/facebook/share/model/AppGroupCreationContent;->privacy:Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 80
    return-void
.end method

.class public final Lcom/facebook/share/model/ShareLinkContent$Builder;
.super Lcom/facebook/share/model/ShareContent$Builder;
.source "ShareLinkContent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/model/ShareLinkContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/model/ShareContent$Builder",
        "<",
        "Lcom/facebook/share/model/ShareLinkContent;",
        "Lcom/facebook/share/model/ShareLinkContent$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private contentDescription:Ljava/lang/String;

.field private contentTitle:Ljava/lang/String;

.field private imageUrl:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 107
    invoke-direct {p0}, Lcom/facebook/share/model/ShareContent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$3(Lcom/facebook/share/model/ShareLinkContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/share/model/ShareLinkContent$Builder;->contentDescription:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$4(Lcom/facebook/share/model/ShareLinkContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/share/model/ShareLinkContent$Builder;->contentTitle:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$5(Lcom/facebook/share/model/ShareLinkContent$Builder;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/share/model/ShareLinkContent$Builder;->imageUrl:Landroid/net/Uri;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/facebook/share/model/ShareLinkContent;
    .locals 2

    .prologue
    .line 146
    new-instance v0, Lcom/facebook/share/model/ShareLinkContent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/model/ShareLinkContent;-><init>(Lcom/facebook/share/model/ShareLinkContent$Builder;Lcom/facebook/share/model/ShareLinkContent;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareLinkContent$Builder;->build()Lcom/facebook/share/model/ShareLinkContent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic readFrom(Lcom/facebook/share/model/ShareContent;)Lcom/facebook/share/model/ShareContent$Builder;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/share/model/ShareLinkContent;

    invoke-virtual {p0, p1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->readFrom(Lcom/facebook/share/model/ShareLinkContent;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareLinkContent$Builder;
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 164
    .line 166
    const-class v0, Lcom/facebook/share/model/ShareLinkContent;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 165
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/ShareLinkContent;

    .line 164
    invoke-virtual {p0, v0}, Lcom/facebook/share/model/ShareLinkContent$Builder;->readFrom(Lcom/facebook/share/model/ShareLinkContent;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Lcom/facebook/share/model/ShareLinkContent;)Lcom/facebook/share/model/ShareLinkContent$Builder;
    .locals 2
    .param p1, "model"    # Lcom/facebook/share/model/ShareLinkContent;

    .prologue
    .line 151
    if-nez p1, :cond_0

    .line 154
    .end local p0    # "this":Lcom/facebook/share/model/ShareLinkContent$Builder;
    :goto_0
    return-object p0

    .line 155
    .restart local p0    # "this":Lcom/facebook/share/model/ShareLinkContent$Builder;
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/share/model/ShareContent$Builder;->readFrom(Lcom/facebook/share/model/ShareContent;)Lcom/facebook/share/model/ShareContent$Builder;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/ShareLinkContent$Builder;

    .line 156
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentDescription(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    .line 157
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getImageUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setImageUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    .line 158
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentTitle(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object p0

    goto :goto_0
.end method

.method public bridge synthetic readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setContentDescription(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;
    .locals 0
    .param p1, "contentDescription"    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/share/model/ShareLinkContent$Builder;->contentDescription:Ljava/lang/String;

    .line 121
    return-object p0
.end method

.method public setContentTitle(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;
    .locals 0
    .param p1, "contentTitle"    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 130
    iput-object p1, p0, Lcom/facebook/share/model/ShareLinkContent$Builder;->contentTitle:Ljava/lang/String;

    .line 131
    return-object p0
.end method

.method public setImageUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareLinkContent$Builder;
    .locals 0
    .param p1, "imageUrl"    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 140
    iput-object p1, p0, Lcom/facebook/share/model/ShareLinkContent$Builder;->imageUrl:Landroid/net/Uri;

    .line 141
    return-object p0
.end method

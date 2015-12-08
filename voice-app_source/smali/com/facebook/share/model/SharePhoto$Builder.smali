.class public final Lcom/facebook/share/model/SharePhoto$Builder;
.super Lcom/facebook/share/model/ShareMedia$Builder;
.source "SharePhoto.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/model/SharePhoto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/model/ShareMedia$Builder",
        "<",
        "Lcom/facebook/share/model/SharePhoto;",
        "Lcom/facebook/share/model/SharePhoto$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private caption:Ljava/lang/String;

.field private imageUrl:Landroid/net/Uri;

.field private userGenerated:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 121
    invoke-direct {p0}, Lcom/facebook/share/model/ShareMedia$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$3(Lcom/facebook/share/model/SharePhoto$Builder;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/share/model/SharePhoto$Builder;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic access$4(Lcom/facebook/share/model/SharePhoto$Builder;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/share/model/SharePhoto$Builder;->imageUrl:Landroid/net/Uri;

    return-object v0
.end method

.method static synthetic access$5(Lcom/facebook/share/model/SharePhoto$Builder;)Z
    .locals 1

    .prologue
    .line 124
    iget-boolean v0, p0, Lcom/facebook/share/model/SharePhoto$Builder;->userGenerated:Z

    return v0
.end method

.method static synthetic access$6(Lcom/facebook/share/model/SharePhoto$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/share/model/SharePhoto$Builder;->caption:Ljava/lang/String;

    return-object v0
.end method

.method public static readListFrom(Landroid/os/Parcel;)Ljava/util/List;
    .locals 2
    .param p0, "in"    # Landroid/os/Parcel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/share/model/SharePhoto;",
            ">;"
        }
    .end annotation

    .prologue
    .line 214
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/share/model/SharePhoto;>;"
    sget-object v1, Lcom/facebook/share/model/SharePhoto;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v0, v1}, Landroid/os/Parcel;->readTypedList(Ljava/util/List;Landroid/os/Parcelable$Creator;)V

    .line 216
    return-object v0
.end method

.method public static writeListTo(Landroid/os/Parcel;Ljava/util/List;)V
    .locals 4
    .param p0, "out"    # Landroid/os/Parcel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/share/model/SharePhoto;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 206
    .local p1, "photos":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/share/model/SharePhoto;>;"
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/share/model/SharePhoto;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 210
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 211
    return-void

    .line 207
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/share/model/SharePhoto;

    .line 208
    .local v1, "photo":Lcom/facebook/share/model/SharePhoto;
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public build()Lcom/facebook/share/model/SharePhoto;
    .locals 2

    .prologue
    .line 183
    new-instance v0, Lcom/facebook/share/model/SharePhoto;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/model/SharePhoto;-><init>(Lcom/facebook/share/model/SharePhoto$Builder;Lcom/facebook/share/model/SharePhoto;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/facebook/share/model/SharePhoto$Builder;->build()Lcom/facebook/share/model/SharePhoto;

    move-result-object v0

    return-object v0
.end method

.method getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/share/model/SharePhoto$Builder;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method getImageUrl()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/share/model/SharePhoto$Builder;->imageUrl:Landroid/net/Uri;

    return-object v0
.end method

.method public bridge synthetic readFrom(Lcom/facebook/share/model/ShareMedia;)Lcom/facebook/share/model/ShareMedia$Builder;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/share/model/SharePhoto;

    invoke-virtual {p0, p1}, Lcom/facebook/share/model/SharePhoto$Builder;->readFrom(Lcom/facebook/share/model/SharePhoto;)Lcom/facebook/share/model/SharePhoto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/share/model/SharePhoto$Builder;->readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/SharePhoto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/SharePhoto$Builder;
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 201
    .line 202
    const-class v0, Lcom/facebook/share/model/SharePhoto;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/SharePhoto;

    .line 201
    invoke-virtual {p0, v0}, Lcom/facebook/share/model/SharePhoto$Builder;->readFrom(Lcom/facebook/share/model/SharePhoto;)Lcom/facebook/share/model/SharePhoto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Lcom/facebook/share/model/SharePhoto;)Lcom/facebook/share/model/SharePhoto$Builder;
    .locals 2
    .param p1, "model"    # Lcom/facebook/share/model/SharePhoto;

    .prologue
    .line 188
    if-nez p1, :cond_0

    .line 191
    .end local p0    # "this":Lcom/facebook/share/model/SharePhoto$Builder;
    :goto_0
    return-object p0

    .restart local p0    # "this":Lcom/facebook/share/model/SharePhoto$Builder;
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/share/model/ShareMedia$Builder;->readFrom(Lcom/facebook/share/model/ShareMedia;)Lcom/facebook/share/model/ShareMedia$Builder;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/SharePhoto$Builder;

    .line 192
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/SharePhoto$Builder;->setBitmap(Landroid/graphics/Bitmap;)Lcom/facebook/share/model/SharePhoto$Builder;

    move-result-object v0

    .line 193
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getImageUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/SharePhoto$Builder;->setImageUrl(Landroid/net/Uri;)Lcom/facebook/share/model/SharePhoto$Builder;

    move-result-object v0

    .line 194
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getUserGenerated()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/SharePhoto$Builder;->setUserGenerated(Z)Lcom/facebook/share/model/SharePhoto$Builder;

    move-result-object v0

    .line 195
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getCaption()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/SharePhoto$Builder;->setCaption(Ljava/lang/String;)Lcom/facebook/share/model/SharePhoto$Builder;

    move-result-object p0

    goto :goto_0
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)Lcom/facebook/share/model/SharePhoto$Builder;
    .locals 0
    .param p1, "bitmap"    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/share/model/SharePhoto$Builder;->bitmap:Landroid/graphics/Bitmap;

    .line 134
    return-object p0
.end method

.method public setCaption(Ljava/lang/String;)Lcom/facebook/share/model/SharePhoto$Builder;
    .locals 0
    .param p1, "caption"    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 167
    iput-object p1, p0, Lcom/facebook/share/model/SharePhoto$Builder;->caption:Ljava/lang/String;

    .line 168
    return-object p0
.end method

.method public setImageUrl(Landroid/net/Uri;)Lcom/facebook/share/model/SharePhoto$Builder;
    .locals 0
    .param p1, "imageUrl"    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 144
    iput-object p1, p0, Lcom/facebook/share/model/SharePhoto$Builder;->imageUrl:Landroid/net/Uri;

    .line 145
    return-object p0
.end method

.method public setUserGenerated(Z)Lcom/facebook/share/model/SharePhoto$Builder;
    .locals 0
    .param p1, "userGenerated"    # Z

    .prologue
    .line 155
    iput-boolean p1, p0, Lcom/facebook/share/model/SharePhoto$Builder;->userGenerated:Z

    .line 156
    return-object p0
.end method

.class public Lcom/facebook/share/internal/LikeContent$Builder;
.super Ljava/lang/Object;
.source "LikeContent.java"

# interfaces
.implements Lcom/facebook/share/model/ShareModelBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/internal/LikeContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/share/model/ShareModelBuilder",
        "<",
        "Lcom/facebook/share/internal/LikeContent;",
        "Lcom/facebook/share/internal/LikeContent$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private objectId:Ljava/lang/String;

.field private objectType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$3(Lcom/facebook/share/internal/LikeContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$4(Lcom/facebook/share/internal/LikeContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectType:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/facebook/share/internal/LikeContent;
    .locals 2

    .prologue
    .line 105
    new-instance v0, Lcom/facebook/share/internal/LikeContent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/internal/LikeContent;-><init>(Lcom/facebook/share/internal/LikeContent$Builder;Lcom/facebook/share/internal/LikeContent;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/facebook/share/internal/LikeContent$Builder;->build()Lcom/facebook/share/internal/LikeContent;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Landroid/os/Parcel;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 120
    .line 121
    const-class v0, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/internal/LikeContent;

    .line 120
    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/LikeContent$Builder;->readFrom(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 2
    .param p1, "content"    # Lcom/facebook/share/internal/LikeContent;

    .prologue
    .line 110
    if-nez p1, :cond_0

    .line 113
    .end local p0    # "this":Lcom/facebook/share/internal/LikeContent$Builder;
    :goto_0
    return-object p0

    .line 114
    .restart local p0    # "this":Lcom/facebook/share/internal/LikeContent$Builder;
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/share/internal/LikeContent;->getObjectId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/LikeContent$Builder;->setObjectId(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    .line 115
    invoke-virtual {p1}, Lcom/facebook/share/internal/LikeContent;->getObjectType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/LikeContent$Builder;->setObjectType(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object p0

    goto :goto_0
.end method

.method public bridge synthetic readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/LikeContent$Builder;->readFrom(Landroid/os/Parcel;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic readFrom(Lcom/facebook/share/model/ShareModel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/LikeContent$Builder;->readFrom(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setObjectId(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 0
    .param p1, "objectId"    # Ljava/lang/String;

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectId:Ljava/lang/String;

    .line 91
    return-object p0
.end method

.method public setObjectType(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 0
    .param p1, "objectType"    # Ljava/lang/String;

    .prologue
    .line 99
    iput-object p1, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectType:Ljava/lang/String;

    .line 100
    return-object p0
.end method

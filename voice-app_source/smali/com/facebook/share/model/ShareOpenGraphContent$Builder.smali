.class public final Lcom/facebook/share/model/ShareOpenGraphContent$Builder;
.super Lcom/facebook/share/model/ShareContent$Builder;
.source "ShareOpenGraphContent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/model/ShareOpenGraphContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/share/model/ShareContent$Builder",
        "<",
        "Lcom/facebook/share/model/ShareOpenGraphContent;",
        "Lcom/facebook/share/model/ShareOpenGraphContent$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private action:Lcom/facebook/share/model/ShareOpenGraphAction;

.field private previewPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 97
    invoke-direct {p0}, Lcom/facebook/share/model/ShareContent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$3(Lcom/facebook/share/model/ShareOpenGraphContent$Builder;)Lcom/facebook/share/model/ShareOpenGraphAction;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->action:Lcom/facebook/share/model/ShareOpenGraphAction;

    return-object v0
.end method

.method static synthetic access$4(Lcom/facebook/share/model/ShareOpenGraphContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->previewPropertyName:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/facebook/share/model/ShareOpenGraphContent;
    .locals 2

    .prologue
    .line 132
    new-instance v0, Lcom/facebook/share/model/ShareOpenGraphContent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/model/ShareOpenGraphContent;-><init>(Lcom/facebook/share/model/ShareOpenGraphContent$Builder;Lcom/facebook/share/model/ShareOpenGraphContent;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->build()Lcom/facebook/share/model/ShareOpenGraphContent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic readFrom(Lcom/facebook/share/model/ShareContent;)Lcom/facebook/share/model/ShareContent$Builder;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/share/model/ShareOpenGraphContent;

    invoke-virtual {p0, p1}, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->readFrom(Lcom/facebook/share/model/ShareOpenGraphContent;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 149
    .line 151
    const-class v0, Lcom/facebook/share/model/ShareOpenGraphContent;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 150
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/ShareOpenGraphContent;

    .line 149
    invoke-virtual {p0, v0}, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->readFrom(Lcom/facebook/share/model/ShareOpenGraphContent;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Lcom/facebook/share/model/ShareOpenGraphContent;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;
    .locals 2
    .param p1, "model"    # Lcom/facebook/share/model/ShareOpenGraphContent;

    .prologue
    .line 137
    if-nez p1, :cond_0

    .line 140
    .end local p0    # "this":Lcom/facebook/share/model/ShareOpenGraphContent$Builder;
    :goto_0
    return-object p0

    .line 141
    .restart local p0    # "this":Lcom/facebook/share/model/ShareOpenGraphContent$Builder;
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/share/model/ShareContent$Builder;->readFrom(Lcom/facebook/share/model/ShareContent;)Lcom/facebook/share/model/ShareContent$Builder;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;

    .line 142
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getAction()Lcom/facebook/share/model/ShareOpenGraphAction;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->setAction(Lcom/facebook/share/model/ShareOpenGraphAction;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;

    move-result-object v0

    .line 143
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getPreviewPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->setPreviewPropertyName(Ljava/lang/String;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;

    move-result-object p0

    goto :goto_0
.end method

.method public setAction(Lcom/facebook/share/model/ShareOpenGraphAction;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;
    .locals 1
    .param p1, "action"    # Lcom/facebook/share/model/ShareOpenGraphAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 109
    .line 110
    if-nez p1, :cond_0

    .line 111
    const/4 v0, 0x0

    .line 109
    :goto_0
    iput-object v0, p0, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->action:Lcom/facebook/share/model/ShareOpenGraphAction;

    .line 114
    return-object p0

    .line 112
    :cond_0
    new-instance v0, Lcom/facebook/share/model/ShareOpenGraphAction$Builder;

    invoke-direct {v0}, Lcom/facebook/share/model/ShareOpenGraphAction$Builder;-><init>()V

    .line 113
    invoke-virtual {v0, p1}, Lcom/facebook/share/model/ShareOpenGraphAction$Builder;->readFrom(Lcom/facebook/share/model/ShareOpenGraphAction;)Lcom/facebook/share/model/ShareOpenGraphAction$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/model/ShareOpenGraphAction$Builder;->build()Lcom/facebook/share/model/ShareOpenGraphAction;

    move-result-object v0

    goto :goto_0
.end method

.method public setPreviewPropertyName(Ljava/lang/String;)Lcom/facebook/share/model/ShareOpenGraphContent$Builder;
    .locals 0
    .param p1, "previewPropertyName"    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 126
    iput-object p1, p0, Lcom/facebook/share/model/ShareOpenGraphContent$Builder;->previewPropertyName:Ljava/lang/String;

    .line 127
    return-object p0
.end method

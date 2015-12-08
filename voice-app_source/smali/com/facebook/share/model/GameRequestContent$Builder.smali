.class public Lcom/facebook/share/model/GameRequestContent$Builder;
.super Ljava/lang/Object;
.source "GameRequestContent.java"

# interfaces
.implements Lcom/facebook/share/model/ShareModelBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/model/GameRequestContent;
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
        "Lcom/facebook/share/model/GameRequestContent;",
        "Lcom/facebook/share/model/GameRequestContent$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;

.field private data:Ljava/lang/String;

.field private filters:Lcom/facebook/share/model/GameRequestContent$Filters;

.field private message:Ljava/lang/String;

.field private objectId:Ljava/lang/String;

.field private suggestions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;

.field private to:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$10(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->suggestions:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$3(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->message:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$4(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->to:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$5(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->title:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$6(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->data:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$7(Lcom/facebook/share/model/GameRequestContent$Builder;)Lcom/facebook/share/model/GameRequestContent$ActionType;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;

    return-object v0
.end method

.method static synthetic access$8(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$9(Lcom/facebook/share/model/GameRequestContent$Builder;)Lcom/facebook/share/model/GameRequestContent$Filters;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->filters:Lcom/facebook/share/model/GameRequestContent$Filters;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/facebook/share/model/GameRequestContent;
    .locals 2

    .prologue
    .line 243
    new-instance v0, Lcom/facebook/share/model/GameRequestContent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/model/GameRequestContent;-><init>(Lcom/facebook/share/model/GameRequestContent$Builder;Lcom/facebook/share/model/GameRequestContent;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/facebook/share/model/GameRequestContent$Builder;->build()Lcom/facebook/share/model/GameRequestContent;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;

    .prologue
    .line 264
    .line 266
    const-class v0, Lcom/facebook/share/model/GameRequestContent;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 265
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/GameRequestContent;

    .line 264
    invoke-virtual {p0, v0}, Lcom/facebook/share/model/GameRequestContent$Builder;->readFrom(Lcom/facebook/share/model/GameRequestContent;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Lcom/facebook/share/model/GameRequestContent;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 2
    .param p1, "content"    # Lcom/facebook/share/model/GameRequestContent;

    .prologue
    .line 248
    if-nez p1, :cond_0

    .line 251
    .end local p0    # "this":Lcom/facebook/share/model/GameRequestContent$Builder;
    :goto_0
    return-object p0

    .line 252
    .restart local p0    # "this":Lcom/facebook/share/model/GameRequestContent$Builder;
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/model/GameRequestContent$Builder;->setMessage(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    .line 253
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getTo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/GameRequestContent$Builder;->setTo(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    .line 254
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/GameRequestContent$Builder;->setTitle(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    .line 255
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/GameRequestContent$Builder;->setData(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    .line 256
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getActionType()Lcom/facebook/share/model/GameRequestContent$ActionType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/GameRequestContent$Builder;->setActionType(Lcom/facebook/share/model/GameRequestContent$ActionType;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    .line 257
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getObjectId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/GameRequestContent$Builder;->setObjectId(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    .line 258
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getFilters()Lcom/facebook/share/model/GameRequestContent$Filters;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/GameRequestContent$Builder;->setFilters(Lcom/facebook/share/model/GameRequestContent$Filters;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    .line 259
    invoke-virtual {p1}, Lcom/facebook/share/model/GameRequestContent;->getSuggestions()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/GameRequestContent$Builder;->setSuggestions(Ljava/util/ArrayList;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object p0

    goto :goto_0
.end method

.method public bridge synthetic readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic readFrom(Lcom/facebook/share/model/ShareModel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/share/model/GameRequestContent;

    invoke-virtual {p0, p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->readFrom(Lcom/facebook/share/model/GameRequestContent;)Lcom/facebook/share/model/GameRequestContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setActionType(Lcom/facebook/share/model/GameRequestContent$ActionType;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .param p1, "actionType"    # Lcom/facebook/share/model/GameRequestContent$ActionType;

    .prologue
    .line 212
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;

    .line 213
    return-object p0
.end method

.method public setData(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .param p1, "data"    # Ljava/lang/String;

    .prologue
    .line 193
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->data:Ljava/lang/String;

    .line 194
    return-object p0
.end method

.method public setFilters(Lcom/facebook/share/model/GameRequestContent$Filters;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .param p1, "filters"    # Lcom/facebook/share/model/GameRequestContent$Filters;

    .prologue
    .line 229
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->filters:Lcom/facebook/share/model/GameRequestContent$Filters;

    .line 230
    return-object p0
.end method

.method public setMessage(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 168
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->message:Ljava/lang/String;

    .line 169
    return-object p0
.end method

.method public setObjectId(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .param p1, "objectId"    # Ljava/lang/String;

    .prologue
    .line 221
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->objectId:Ljava/lang/String;

    .line 222
    return-object p0
.end method

.method public setSuggestions(Ljava/util/ArrayList;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/share/model/GameRequestContent$Builder;"
        }
    .end annotation

    .prologue
    .line 237
    .local p1, "suggestions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->suggestions:Ljava/util/ArrayList;

    .line 238
    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 204
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->title:Ljava/lang/String;

    .line 205
    return-object p0
.end method

.method public setTo(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Builder;
    .locals 0
    .param p1, "to"    # Ljava/lang/String;

    .prologue
    .line 181
    iput-object p1, p0, Lcom/facebook/share/model/GameRequestContent$Builder;->to:Ljava/lang/String;

    .line 182
    return-object p0
.end method

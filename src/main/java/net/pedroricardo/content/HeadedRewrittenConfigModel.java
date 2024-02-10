package net.pedroricardo.content;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.Nest;
import io.wispforest.owo.config.annotation.RestartRequired;

@Modmenu(modId = "headed-rewritten")
@Config(name = "headed-rewritten", wrapperName = "HeadedRewrittenConfig")
public class HeadedRewrittenConfigModel {
    @RestartRequired
    public boolean chargedCreeperDrops = false;

    public boolean changeHeadCollisions = true;

    @Nest
    public HeadURLs headURLs = new HeadURLs();

    public static class HeadURLs {
        @RestartRequired
        public String WHITE_SHEEP = "6dfe7cc46d749b153261c1dc11abbf2a3108ea1ba0b2650280eed1592dcfc75b";
        @RestartRequired
        public String ORANGE_SHEEP = "f684d04fa80aa59da14535dead3883d097fbba400625659f5259964806ba66f0";
        @RestartRequired
        public String MAGENTA_SHEEP = "a8e1f05f0dacca63a731874f90a693ffe21ff832e2b1e1d07b65c8764526f089";
        @RestartRequired
        public String LIGHT_BLUE_SHEEP = "ebf23af8719c437b3ee84019ba3c9e69ca854d3a8afd5cba6d9696c053b48614";
        @RestartRequired
        public String YELLOW_SHEEP = "94b28f035735906f82ffc4dba99c9f0b55240e426cd1c525a9aa77180eec4934";
        @RestartRequired
        public String LIME_SHEEP = "6bead0342ae89b8dfd3d711a60add65e2c2bfea8d0bd274a7587deed7a31892e";
        @RestartRequired
        public String PINK_SHEEP = "6363e8a93d287a84e640309ae83ca1de0a0b257505a20ec55b3349d40a44854";
        @RestartRequired
        public String GRAY_SHEEP = "3fafecf0603b2dcd7984d252586069895db9aa78e1841bd554b19508dcf967a1";
        @RestartRequired
        public String LIGHT_GRAY_SHEEP = "1d2e2e93a142bfd43f240d37de8f9b0976e76e65b22651908259e46db770e";
        @RestartRequired
        public String CYAN_SHEEP = "5d42fcbcaf9d48f73ffb0c3c36f34b4643295f6daa6cc74ab9d242ed5aa5636";
        @RestartRequired
        public String PURPLE_SHEEP = "3449d08291dae45a24673619602f435b57f4cd4e9e98d2e0fbec4f18144781d3";
        @RestartRequired
        public String BLUE_SHEEP = "740e277da6c398b749a32f9d080f1cf4c4ef3f1f20dd9e5f422509e7ff593c0";
        @RestartRequired
        public String BROWN_SHEEP = "3128d086bc81669fc2255bb22cadc66a0f5ed70885e84c32d37c1b484db35901";
        @RestartRequired
        public String GREEN_SHEEP = "9ea887eae4b07636e9e2f906609b00ab8d9b86b74728b819ff6f376583ea139";
        @RestartRequired
        public String RED_SHEEP = "5478e057158de6f45e2541cd17788e640ccb59723de59c254e82ab5711f3fc27";
        @RestartRequired
        public String BLACK_SHEEP = "13335e8065c7b5dfea58d3df7474f396af4fa0a2ba52a3c9b7fba68319271c91";
        @RestartRequired
        public String JEB_SHEEP = "233326765a190ebf90d5486d71f20e2597e4bee2a391fecbbd80debfe1f82d78";
        @RestartRequired
        public String ALLAY = "cc0389177dbaa92f0d5ffdf848862c7f9b36df222fbfd737e2639dc3059e0cf3";
        @RestartRequired
        public String LUCY_AXOLOTL = "667e15eab73064b6680d1db98ba445ed0914ba35a799997c0da2b03ffc3a8826";
        @RestartRequired
        public String WILD_AXOLOTL = "47cf0274998bf5a7f38b37036e154f112fa2e28bad40d5a7c94765fe4f52211e";
        @RestartRequired
        public String GOLD_AXOLOTL = "e58560115faad11619b3d55de79ef2a053f478a67194bbe9247edea0bc98e834";
        @RestartRequired
        public String CYAN_AXOLOTL = "851196d43930659d717e1b6a046a08d1220fcb4e31c4856bc33e7551986ef1d";
        @RestartRequired
        public String BLUE_AXOLOTL = "68fd10b0fef4595960b1f64193bc8a1865a2d2ed48b2e2ce03d994563027df95";
        @RestartRequired
        public String BAT = "8eb81c40b5b63f3d830340f8fcc4aab538d4e544e95eec9d70d61f786f6b6974";
        @RestartRequired
        public String BEE = "59ac16f296b461d05ea0785d477033e527358b4f30c266aa02f020157ffca736";
        @RestartRequired
        public String POLLINATED_BEE = "b727d0ab03f5cd022f8705d3f7f133ca4920eae8e1e47b5074433a137e691e4e";
        @RestartRequired
        public String ANGRY_BEE = "e400223f1fa54741d421d7e8046409d5f3e15c7f4364b1b739940208f3b686d4";
        @RestartRequired
        public String ANGRY_POLLINATED_BEE = "e6b74e052b74288799ba6d9f35c5d0221cf8b04331547ec2f68d73597ae2c9b";
        @RestartRequired
        public String BLAZE = "dee23dc7a10c6a87ef937454c0e94ed42c23aa641a91ed8470a3042d05c52c52";
        @RestartRequired
        public String BREEZE = "a275728af7e6a29c88125b675a39d88ae9919bb61fdc200337fed6ab0c49d65c";
        @RestartRequired
        public String CAMEL = "e67d4597340166e1978a668a06bf5756c17b4cb5b40ab8ff244093b6b8bc75d3";
        @RestartRequired
        public String ALL_BLACK_CAT = "22c1e81ff03e82a3e71e0cd5fbec607e11361089aa47f290d46c8a2c07460d92";
        @RestartRequired
        public String BLACK_CAT = "4fd10c8e75f67398c47587d25fc146f311c053cc5d0aeab8790bce36ee88f5f8";
        @RestartRequired
        public String BRITISH_SHORTHAIR_CAT = "5389e0d5d3e81f84b570e2978244b3a73e5a22bcdb6874b44ef5d0f66ca24eec";
        @RestartRequired
        public String CALICO_CAT = "340097271bb680fe981e859e8ba93fea28b813b1042bd277ea3329bec493eef3";
        @RestartRequired
        public String JELLIE_CAT = "a0db41376ca57df10fcb1539e86654eecfd36d3fe75e8176885e93185df280a5";
        @RestartRequired
        public String PERSIAN_CAT = "ff40c746260ef91c96b27159795e87191ae7ce3d5f767bf8c74faad9689af25d";
        @RestartRequired
        public String RAGDOLL_CAT = "dc7a45d25889e3fdf7797cb258e26d4e94f5bc13eef00795dafef2e83e0ab511";
        @RestartRequired
        public String RED_CAT = "2113dbd3c6a078a17b4edb78ce07d836c38dace5027d4b0a83fd60e7ca7a0fcb";
        @RestartRequired
        public String SIAMESE_CAT = "d5b3f8ca4b3a555ccb3d194449808b4c9d783327197800d4d65974cc685af2ea";
        @RestartRequired
        public String TABBY_CAT = "de28d30db3f8c3fe50ca4f26f3075e36f003ae8028135a8cd692f24c9a98ae1b";
        @RestartRequired
        public String WHITE_CAT = "21d15ac9558e98b89aca89d3819503f1c5256c2197dd3c34df5aac4d72e7fbed";
        @RestartRequired
        public String CAVE_SPIDER = "a6a1c2599fc91203a65a03d479c8dc87f662deac3663c16c5e04d625b3978a25";
        @RestartRequired
        public String CHICKEN = "42af6e5847eea099e1b0ab8c20a9e5f3c7190158bda54e28133d9b271ec0cb4b";
        @RestartRequired
        public String COD = "f246e19b32cf784549447e07b96072e1f656d78e93ccca5637485e6749734652";
        @RestartRequired
        public String COW = "63d621100fea5883922e78bb448056448c983e3f97841948a2da747d6b08b8ab";
        @RestartRequired
        public String DOLPHIN = "8e9688b950d880b55b7aa2cfcd76e5a0fa94aac6d16f78e833f7443ea29fed3";
        @RestartRequired
        public String DONKEY = "4e25ee9273ad579d44bf406f6f6295586481ea198fd572076cd0c5882da7e6cc";
        @RestartRequired
        public String DROWNED = "c3f7ccf61dbc3f9fe9a6333cde0c0e14399eb2eea71d34cf223b3ace22051";
        @RestartRequired
        public String ELDER_GUARDIAN = "4a2d64f4a00e9c85f67262edcacb84523581ae0f37bdab22dd704524f62e169f";
        @RestartRequired
        public String ENDERMAN = "8977a94f02498cad0cfdb65ca7cb72e23111a914d8c670acccc7a65b347d7776";
        @RestartRequired
        public String ENDERMITE = "8c6b65c22b4465ba6793b2195cd5084ce83b88dca6e55eb9484540acd7352a50";
        @RestartRequired
        public String EVOKER = "390fbd88f659d3963c68cbbcb7c7121d8195a8be65bbd2bf1257d1f69bccc0c7";
        @RestartRequired
        public String FOX = "d7e0043111bc57090856259155571c7906e707046df041b8b572704c451fcd82";
        @RestartRequired
        public String SNOW_FOX = "41436377eb4c4b4e39fb0e1ed8899fb61ee1814a9169b8d08729ef01dc85d1ba";
        @RestartRequired
        public String COLD_FROG = "76877893e920ff5dfa4b5fbd14dabee2e6308a6f97c3a19b08e241a29eb9a5c3";
        @RestartRequired
        public String TEMPERATE_FROG = "a50d1073d41f193405d95b1d941f9fe1a7ff080e38155d7bb780bbbd8e86f70d";
        @RestartRequired
        public String WARM_FROG = "d5b0da43975b83c3322788dda317506333843aebe5512787cb2e3d769ed2b382";
        @RestartRequired
        public String GHAST = "c53de31a2d0041a6ef75bf7a6c8468464db1aaa6201ebb1a6013edb2245c7607";
        @RestartRequired
        public String GLOW_SQUID = "4b2e9b6581fed48a99e0323091ad5c3c326cda20073e28a902a0373f7382b59f";
        @RestartRequired
        public String GOAT = "87473e055df6e7fd98664e9fdb63675f088106305d744024a41bb358918a142b";
        @RestartRequired
        public String GUARDIAN = "e2ba34416670454b1a20496f80b9398529f49003fc613eb930248ea9b5d1a391";
        @RestartRequired
        public String HOGLIN = "bc4a7f57fc03b13aa2f9d83cdd4822b936793096daf51e78025bbd241ed6f68d";
        @RestartRequired
        public String WHITE_HORSE = "c7bc61609730f2cb010268fab0821bd47352699750a150599f21c3fc4e92591a";
        @RestartRequired
        public String CREAMY_HORSE = "42a0d54cc071267d6bfd5f523f8c89dcfdc5e805fabbb76010cb3befa465aa94";
        @RestartRequired
        public String CHESTNUT_HORSE = "6c8720d1f552693b40a9a33afa41cef06afd142833bed9fa5b887e88f05f49fa";
        @RestartRequired
        public String BROWN_HORSE = "6771800770cb4e814a3d91186fcd795ec82e06102ff7c1ee4e5c380102a0c70f";
        @RestartRequired
        public String BLACK_HORSE = "6723fa5be6ac2292a72230f5fd7ab663493bd8f7e64816424dc5bf24f133890c";
        @RestartRequired
        public String GRAY_HORSE = "c25986102181083fb317bc5712f7104daa5a3e889264dfebb9159f6e08bac90c";
        @RestartRequired
        public String DARK_BROWN_HORSE = "7f2341aaa0c82c22bbc207063e319291097c539adad9aa913eb8001b11aa59da";
        @RestartRequired
        public String HUSK = "7338318bc91a36cd5ab6aa885c9a4ee2bdacdaa5c66b2a99dfb0a560983f2480";
        @RestartRequired
        public String ILLUSIONER = "d382701c67d6c54c907558891dc176225112518771e061c5d8bd918479e6bdd8";
        @RestartRequired
        public String IRON_GOLEM = "fe7c0719fabe116dce605199bcadc69a538860864ef15706983ff662822d9fe3";
        @RestartRequired
        public String CREAMY_LLAMA = "4d67fd4bff293269cb908974dca83c33485e435ed5a8e1dbd6521c61687140";
        @RestartRequired
        public String WHITE_LLAMA = "80277e6b3d9f7819efc7da4b42745f7ab9a63ba8f36d6b84a7a250c6d1a358eb";
        @RestartRequired
        public String BROWN_LLAMA = "c2b1ecff77ffe3b503c30a548eb23a1a08fa26fd67cdff389855d74921368";
        @RestartRequired
        public String GRAY_LLAMA = "cf24e56fd9ffd7133da6d1f3e2f455952b1da462686f753c597ee82299a";
        @RestartRequired
        public String MAGMA_CUBE = "b81718d4984847a4ad3ec081a4ebffd183743239aecab60322138a72609812c3";
        @RestartRequired
        public String RED_MOOSHROOM = "da80606e82c642f141587733e3180ae57f646442c9fffd4e5997457e34311a29";
        @RestartRequired
        public String BROWN_MOOSHROOM = "7e6466302a5ab4398b4e477349808e5d9402ea3ad8fc42e2446e4bed0a5ed5e";
        @RestartRequired
        public String MULE = "41c224a1031be434d25ae1885bf4ff400c9894c69bfef56a49354c5625c0c09c";
        @RestartRequired
        public String OCELOT = "9175cc43ea8ae20168a1f170810b4da4d9b4ebd3c9976e9fc22e9f995c3cbc3c";
        @RestartRequired
        public String AGGRESSIVE_PANDA = "e546e436d166b17f0521bd8538ea13cd6ee3b5df102eb32e3e425cb285d44063";
        @RestartRequired
        public String BROWN_PANDA = "1d5f6d6126728671b44c1c775f99617424e33611b5d31ad2acff2804eb96eb06";
        @RestartRequired
        public String LAZY_PANDA = "587f1f5db2e24df4daaed4685d6aee5deb7cdd029630f0079c1f8e1f9741acfd";
        @RestartRequired
        public String PANDA = "59df47e015d5c1c68d72be11bb656380fc6db533aab38941a91b1d3d5e396497";
        @RestartRequired
        public String PLAYFUL_PANDA = "8cadd4bf3c4cace916680e1fef90b5d16ad6643951725668ba6b4996b69ca140";
        @RestartRequired
        public String WEAK_PANDA = "cc56a355fbe0e2fbd28e85c4d815ffa5d1f9d5f8798dbc259ff88c4addb202ae";
        @RestartRequired
        public String WORRIED_PANDA = "fb86fd1bf8cbce23bc08fb90691717611addc85ab823b7714aec98a5660eff15";
        @RestartRequired
        public String BLUE_PARROT = "b94bd3fcf4d46354ede8fef73126dbcab52b301a1c8c23b6cdfc12d612b61bea";
        @RestartRequired
        public String GREEN_PARROT = "6a1dc33115232f800825cac9e3d9ed03fc18ae553c25b8059513000c59e354fe";
        @RestartRequired
        public String GRAY_PARROT = "71be723aa17393d99daddc119c98b2c79c54b35debe05c7138edeb8d0256dc46";
        @RestartRequired
        public String RED_PARROT = "40a3d47f54e71a58bf8f57c5253fb2d213f4f55bb7934a19104bfb94edc76eaa";
        @RestartRequired
        public String CYAN_PARROT = "7268ce37be8507ed67e3d40b617e2d72f66f9d20b106efb08e6ba041f9b9ef10";
        @RestartRequired
        public String PHANTOM = "7e95153ec23284b283f00d19d29756f244313a061b70ac03b97d236ee57bd982";
        @RestartRequired
        public String PIG = "41ee7681adf00067f04bf42611c97641075a44ae2b1c0381d5ac6b3246211bfe";
        @RestartRequired
        public String PIGLIN_BRUTE = "6488799c83ecb29452ceba89c3c0099219274ce5b2bfb8ad0b3ea4c65fac4630";
        @RestartRequired
        public String PILLAGER = "c225f0b49c5295048a409c9c601cca79aa8eb52aff5e2033ebb865f4367ef43e";
        @RestartRequired
        public String POLAR_BEAR = "cd8702911e616c0d32fbe778d195f21ecce9025bcbd09151e3d97af3192aa7ec";
        @RestartRequired
        public String PUFFERFISH = "e2733d5da59c82eaf310b382aff40bd513c44354dbbabfe14b066a556810a7f9";
        @RestartRequired
        public String BLACK_RABBIT = "b2b425ff2a236ab19cc9397195db40f8f185b191c40bf44b26e95eac9fb5efa3";
        @RestartRequired
        public String BROWN_RABBIT = "cfd4f86cf7473fbae93b1e090489b64c0be126c7bb16ffc88c002447d5c72795";
        @RestartRequired
        public String KILLER_BUNNY = "71dd767929ef2fd2d43e86e8744c4b0d810853471201f2dfa18f96a67de56e2f";
        @RestartRequired
        public String GOLD_RABBIT = "767b722656fdeec39974d3395c5e18b47c5e237bce5bbced9b7553aa14b54587";
        @RestartRequired
        public String SALT_PEPPER_RABBIT = "9238519ff39815b16c4062823e43161ffaac96894fe088b018e6a24c26e181ec";
        @RestartRequired
        public String TOAST_RABBIT = "51a57c3d0a9b10e13f66df74200cb8a6d484c672226812d74e25f6c027410616";
        @RestartRequired
        public String WHITE_RABBIT = "9542d7160987148a5d8e20e469bd9b3c2a3946c7fb5923f55b9beae99185f";
        @RestartRequired
        public String BLACK_WHITE_RABBIT = "35f72a2195ebf4117c5056cfe2b7357ec5bf832ede1856a7773ee42a0d0fb3f0";
        @RestartRequired
        public String RAVAGER = "eb4db2986140e251e32e70ed08c8a081720313ce257632be1ef94a0737394db";
        @RestartRequired
        public String SALMON = "791d9e69b795da4eaacfcf7350dfe8ae367fed833556706e040339dd7fe0240a";
        @RestartRequired
        public String SHULKER = "fb9e6af6b819f3d90e67ce2e7059fbef31da2aa953d35e3454f1021fa912efde";
        @RestartRequired
        public String SILVERFISH = "f25e9fae371664de1a800c84d025124abb8f15111807c8bc1ab9126aacbd4f95";
        @RestartRequired
        public String SKELETON_HORSE = "6e226705bd2a9e7bb8d6b0f4daa969b9e12d4ae5c66da693bb5f4a4a1e6aa296";
        @RestartRequired
        public String SLIME = "c06424ec7a196b15f9ad5733a36a6d1f2e6a0d42ffce1e1508f90f312ac4caed";
        @RestartRequired
        public String SNIFFER = "c84a7e7fe197b7e7419b51d46cc233551b9ec899de1afe7f653e4f8fb26a686e";
        @RestartRequired
        public String SNOW_GOLEM = "caa3e17ef1b29a4b87fa43dee1db12c41fd39aa387fa13af2a079b5b378fde8b";
        @RestartRequired
        public String SPIDER = "de28e6629b6ed1da94d4a818761612c36fb3a6813c4b63fb9fea5076415f3f0c";
        @RestartRequired
        public String SQUID = "8351b7d9a4f36cfe31fd59d8c900e419a135144105e7a981caa5a168dcff325b";
        @RestartRequired
        public String STRAY = "592b5597085e35db53d9bda008cae72b2f00cd7d4cd8dc69ff174a55b689e6e";
        @RestartRequired
        public String STRIDER = "9c40fad1c11de9e6422b405426e9b97907f35bce345e3758604d3e7be7df884";
        @RestartRequired
        public String TADPOLE = "3daf1653b5f59b5ec5a3f79609cb4233579fef07e693b61749e0900149edf563";
        @RestartRequired
        public String CREAMY_TRADER_LLAMA = "e89a2eb17705fe7154ab041e5c76a08d41546a31ba20ea3060e3ec8edc10412c";
        @RestartRequired
        public String WHITE_TRADER_LLAMA = "7087a556d4ffa95ecd2844f350dc43e254e5d535fa596f540d7e77fa67df4696";
        @RestartRequired
        public String BROWN_TRADER_LLAMA = "8424780b3c5c5351cf49fb5bf41fcb289491df6c430683c84d7846188db4f84d";
        @RestartRequired
        public String GRAY_TRADER_LLAMA = "be4d8a0bc15f239921efd8be3480ba77a98ee7d9ce00728c0d733f0a2d614d16";
        @RestartRequired
        public String TROPICAL_FISH = "34a0c84dc3c090df7bafc4367a9fc6c8520da2f73efffb80e934d1189eadac41";
        @RestartRequired
        public String TURTLE = "304931200ad460b650a190e8d41227c3999fbeb933b51ca49fd9e5920d1f8e7d";
        @RestartRequired
        public String VEX = "b9538f2830c4dea6996ed744785504e32e0e20d8663edab6b0222f2c022077bd";
        @RestartRequired
        public String CHARGING_VEX = "4a4e518e16e4b5c114acbd9c61cd18292da9ef60550a4fcae27d39ae293e477a";
        @RestartRequired
        public String VILLAGER = "ae0e9591e11aaef4c2c51d9ac69514e340485defcc2c12c38cd12386c2ec6b78";
        @RestartRequired
        public String ARMORER_VILLAGER = "1ef627f566ac0a7828bad93e9e4b9643d99a928a13d5f977bf441e40db1336bf";
        @RestartRequired
        public String BUTCHER_VILLAGER = "a1bad64185e04bf1dafe3da84933d02545ea4a63221a10d0f07759179112bdc2";
        @RestartRequired
        public String CARTOGRAPHER_VILLAGER = "e3aecfbe801cf32b5d1b0b1f6680049666158678c53f4a651fc83e0df9d3738b";
        @RestartRequired
        public String CLERIC_VILLAGER = "5b9e582e2f9b89d556e79c4697f706b1dd4929ecae3c07ee90bf1d5be319bf6f";
        @RestartRequired
        public String FARMER_VILLAGER = "d9272d03cda6290e4d925a7e850a745e711fe5760f6f06f93d92b8f8c739db07";
        @RestartRequired
        public String FISHERMAN_VILLAGER = "d189fb4acd15d73ff2a58a88df0466ad9f4c154a2008e5c6265d5c2f07d39376";
        @RestartRequired
        public String FLETCHER_VILLAGER = "bf611f12e18ce44a57238eef1cae03cd9f730a7a45e0ec248f14ce84e9c48056";
        @RestartRequired
        public String LIBRARIAN_VILLAGER = "cdcaa574babb40ee0fa83f2fd5ea20cff31ffa272fe113588ceee469682128e7";
        @RestartRequired
        public String SHEPHERD_VILLAGER = "2abf4e9154ac9271941c733eacc62dc9fc0a6dc1b5d67c78ca98afb5cb1be9b2";
        @RestartRequired
        public String WEAPONSMITH_VILLAGER = "8476ffa410bbe7fa70909965a125f4a4e9a4fb1ce1b8b3c34bfb73aaffd4ce43";
        @RestartRequired
        public String VINDICATOR = "2dabafde27ee12b09865047aff6f183fdb64e04dae1c00ccbde04ad93dcc6c95";
        @RestartRequired
        public String WANDERING_TRADER = "5f1379a82290d7abe1efaabbc70710ff2ec02dd34ade386bc00c930c461cf932";
        @RestartRequired
        public String WARDEN = "b2f3879b737127485eb35ddee748d06cf914b193d97753ae34e92230842831fb";
        @RestartRequired
        public String WITCH = "a520f12c63c7912186c4be4e30c33c5acaec0db0b6abd836d517d74a62275d4b";
        @RestartRequired
        public String WITHER = "eda10828f63b7ecdefd767b3245fbdaa13c3ec0c6b13774f1ee8d307c034c383";
        @RestartRequired
        public String WITHER_PROJECTILE = "b37c5814a92f8ec0f6ae9933abe9542e165190768e760478543aebeed4027c27";
        @RestartRequired
        public String BLUE_WITHER_PROJECTILE = "d3682b06203b9de4c28541071a26cdc340dd25d4c372b7023ec2f412021d62f7";
        @RestartRequired
        public String WOLF = "b6439a43e5687008815a2dd1ff4a134c12221b782336678b979ad13dce39665e";
        @RestartRequired
        public String ANGRY_WOLF = "8d1aa7e3b9564b3846f1dea14f1b1ccbf399bbb23b952dbd7eec41802a289c96";
        @RestartRequired
        public String ZOGLIN = "2e3493a956bfd7588ed1a8ea858759667659d58100cbecd6d96ccc0ca9b36923";
        @RestartRequired
        public String ZOMBIE_HORSE = "6618ffbe1cfa2058fe80a065f70c128c225a1e0bc9deaf8b38b0395443f40909";
        @RestartRequired
        public String ZOMBIE_VILLAGER = "fb552c90f212e855d12255d5cd62ed38b9cd7e30e73f0ea779d1764330e69264";
        @RestartRequired
        public String ARMORER_ZOMBIE_VILLAGER = "c8679e034767d518660d9416dc5eaf319d697682ac40c886e3c2bc8dfa1de1d";
        @RestartRequired
        public String BUTCHER_ZOMBIE_VILLAGER = "9cce8d6ce4124cec3e84a852e70f50293f244ddc9ee8578f7d6d8929e16bad69";
        @RestartRequired
        public String CARTOGRAPHER_ZOMBIE_VILLAGER = "e60800b01012e963e7c20c8ba14b70a0264d146a850deffbca7bfe512f4cb23d";
        @RestartRequired
        public String CLERIC_ZOMBIE_VILLAGER = "2958578be0e12172734a78242dab14964abc85ab9b596361f7c5daf8f14a0feb";
        @RestartRequired
        public String FARMER_ZOMBIE_VILLAGER = "f77d415f9baa4fa4b5e058f5b81bf7f003b0a2c90a4831e53a7dbc09841c5511";
        @RestartRequired
        public String FISHERMAN_ZOMBIE_VILLAGER = "6905d53fe4faeb0b315a6878c9ab81b4be52c31cd478c027f0d7ece9f6da8914";
        @RestartRequired
        public String FLETCHER_ZOMBIE_VILLAGER = "2ea26ac0e25498adada4ecea58bb4e76da32d5ca2de307efe5e4218fb7c5ef89";
        @RestartRequired
        public String LIBRARIAN_ZOMBIE_VILLAGER = "62211a1f409cca4249c70d20ca80399fa4844ea417458be988cc21eb4797375e";
        @RestartRequired
        public String SHEPHERD_ZOMBIE_VILLAGER = "691391bef3a46ef267d3b7171086ba4c8d17f2a6b0f83fa2ac30efe914b7c249";
        @RestartRequired
        public String WEAPONSMITH_ZOMBIE_VILLAGER = "4370894b5cc305d87aa08c3b4b08587db68ff29e7a3ef354cad6abca50e5528b";
        @RestartRequired
        public String ZOMBIFIED_PIGLIN = "2df03128b002a70708d6825ed6cf54ddf694b3766d78d5649030b1cb8b34c6fa";
    }
}

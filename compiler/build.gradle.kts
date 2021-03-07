import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion

plugins {
    id("java-library")
    id("kotlin")
    id("kotlin-kapt")
    id("com.github.dcendents.android-maven")
    id("com.jfrog.bintray")
}

dependencies {
    implementation("com.google.auto.service:auto-service:1.0-rc7")
    implementation("com.squareup:javapoet:1.13.0")
    implementation("org.apache.commons:commons-lang3:3.9")
    implementation("org.apache.commons:commons-collections4:4.1")
    implementation("com.github.leifzhang:RouterAnnotation:0.5.0")
    compileOnly(files(org.gradle.internal.jvm.Jvm.current().toolsJar))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${getKotlinPluginVersion()}")
    kapt("com.google.auto.service:auto-service:1.0-rc7")
}
/*


def siteUrl = 'https://github.com/Leifzhang/AndroidRouter' // 项目的主页
def gitUrl = 'https://github.com/Leifzhang/AndroidRouter.git' // Git仓库的url
group = PROJ_GROUP // Maven Group ID for the artifact，一般填你唯一的包名
version = PROJ_VERSION
install {
    repositories.mavenInstaller {
        // This generates POM.xml with proper parameters
        pom {
            project {
                packaging 'aar'
                // Add your description here
                name 'An Android Router Lib compiler' //项目描述
                url siteUrl
                        // Set your license
                        licenses {
                            license {
                                name 'The Apache Software License, Version 2.0'
                                url 'http://www.apache.org/licenses/LICENSE-2.0.txt'
                            }
                        }
                developers {
                    developer {
                        id 'LeifZhang'    //填写的一些基本信息
                        name '肉老师'
                        email 'leifzhanggithub@gmail.com'
                    }
                }
                scm {
                    connection gitUrl
                            developerConnection gitUrl
                            url siteUrl
                }
            }
        }
    }
}
task("sourcesJar"){
    typeOf<Jar>()
}
task sourcesJar (type: Jar, dependsOn: classes) {
    classifier = 'sources'
    from sourceSets . main . allSource
}

task javadocJar (type: Jar, dependsOn: javadoc) {
    classifier = 'javadoc'
    from javadoc . destinationDir
}

artifacts {
    archives javadocJar
            archives sourcesJar
}
Properties properties = new Properties()
properties.load(project.rootProject.file('local.properties').newDataInputStream())
bintray {
    user = properties.getProperty("bintray.user")
    key = properties.getProperty("bintray.apikey")
    configurations = ['archives']
    pkg {
        repo = "maven"  //发布到JCenter上的项目名字
        websiteUrl = siteUrl
        vcsUrl = gitUrl
        licenses = ["Apache-2.0"]
        publish = true
    }
}
*/

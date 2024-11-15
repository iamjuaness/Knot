<div align="left" style="position: relative;">
<img src="https://img.icons8.com/external-tal-revivo-regular-tal-revivo/96/external-readme-is-a-easy-to-build-a-developer-hub-that-adapts-to-the-user-logo-regular-tal-revivo.png" align="right" width="30%" style="margin: -20px 0 0 20px;">
<h1>KNOT</h1>
<p align="left">
	<em><code>❯ Knot is a Java library and data structure designed to model, save data and visualize complex structures, such as knots, molecules and helical structures. Inspired by knot theory, this library allows you to graphically represent links between nodes with specific crossings, which is ideal for visually exploring patterns and connections in two-dimensional graphs.</code></em>
</p>
<p align="left">
	<img src="https://img.shields.io/github/license/iamjuaness/Knot?style=flat-square&logo=opensourceinitiative&logoColor=white&color=09f79f" alt="license">
	<img src="https://img.shields.io/github/last-commit/iamjuaness/Knot?style=flat-square&logo=git&logoColor=white&color=09f79f" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/iamjuaness/Knot?style=flat-square&color=09f79f" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/iamjuaness/Knot?style=flat-square&color=09f79f" alt="repo-language-count">
	<img src="https://jitpack.io/v/iamjuaness/Knot.svg" alt="repo-jar">
</p>
<p align="left">Built with the tools and technologies:</p>
<p align="left">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat-square&logo=openjdk&logoColor=white" alt="java">
</p>
</div>
<br clear="right">

<details><summary>Table of Contents</summary>

- [📍 Overview](#-overview)
- [👾 Features](#-features)
- [📁 Project Structure](#-project-structure)
  - [📂 Project Index](#-project-index)
- [🚀 Getting Started](#-getting-started)
  - [☑️ Prerequisites](#-prerequisites)
  - [⚙️ Installation](#-installation)
  - [🤖 Usage](#🤖-usage)
  - [🧪 Testing](#🧪-testing)
- [📌 Project Roadmap](#-project-roadmap)
- [🔰 Contributing](#-contributing)
- [🎗 License](#-license)
- [🙌 Acknowledgments](#-acknowledgments)

</details>
<hr>

## 📍 Overview

Knot is a Java library developed for creating and exploring graph-based structures such as knots, molecular bonds, and helical formations. This library utilizes `KnotNode` and `KnotEdge` classes to represent nodes and edges with customizable crossing types (e.g., over and under crossings), enabling users to construct both simple and complex structures like DNA helices or molecular models.

---

## 👾 Features

- **Graph Representation**: Model nodes and edges with customizable crossing types.
- **Library of Knots**: Pre-built knots such as the Trefoil Knot, Figure-Eight Knot, and Clove Hitch.
- **Molecular Modeling**: Represent molecules with covalent bonds and 3D-like node spacing.
- **Helical Structures**: Create DNA-like double helices with paired nucleotide nodes.
- **Visualization Capabilities**: Easily visualize complex knot patterns and molecule-like structures.

---

## 📁 Project Structure

```sh
└── Knot/
    ├── LICENSE
    ├── pom.xml
    └── src
        └── main
            └── java
                └── knot
                    ├── KnotEdge.java
                    ├── KnotGraph.java
                    ├── KnotLibrary.java
                    ├── KnotNode.java
                    └── KnotVisualizer.java
```


### 📂 Project Index
<details open>
	<summary><b><code>KNOT/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			</table>
		</blockquote>
	</details>
	<details> <!-- src Submodule -->
		<summary><b>src</b></summary>
		<blockquote>
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>knot</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/iamjuaness/Knot/blob/master/src/main/java/knot/KnotVisualizer.java'>KnotVisualizer.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/iamjuaness/Knot/blob/master/src/main/java/knot/KnotGraph.java'>KnotGraph.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/iamjuaness/Knot/blob/master/src/main/java/knot/KnotLibrary.java'>KnotLibrary.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/iamjuaness/Knot/blob/master/src/main/java/knot/KnotEdge.java'>KnotEdge.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/iamjuaness/Knot/blob/master/src/main/java/knot/KnotNode.java'>KnotNode.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with Knot, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java


### ⚙️ Installation

#### With Maven

Add the repository and dependency in your `pom.xml` file:

````xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.iamjuaness</groupId>
    <artifactId>knot</artifactId>
    <version>0.0.1</version>
</dependency>
````
#### With Gradle

Add JitPack in the `build.gradle` file and then the dependency:

````xml
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.iamjuaness:knot:0.0.1'
}
````



### 🤖 Usage
#### 1. Creating and visualizing a simple knot

This example shows how to create a Trefoil Knot and visualize it using the `KnotVisualizer` class:

````class

````

---
## 📌 Project Roadmap

- [X] **`Task 1`**: <strike>Implement basic Knot and molecular structures.</strike>
- [ ] **`Task 2`**: Expand visualization capabilities (3D support).
- [ ] **`Task 3`**: Add further molecular structures (e.g., amino acids, protein backbones).

---

## 🔰 Contributing

- **💬 [Join the Discussions](https://github.com/iamjuaness/Knot/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/iamjuaness/Knot/issues)**: Submit bugs found or log feature requests for the `Knot` project.
- **💡 [Submit Pull Requests](https://github.com/iamjuaness/Knot/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/iamjuaness/Knot
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/iamjuaness/Knot/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=iamjuaness/Knot">
   </a>
</p>
</details>

---

## 🎗 License

This project is protected under the [Mit License](https://choosealicense.com/licenses/mit/) License. For more details, refer to the [LICENSE](https://github.com/iamjuaness/knot/blob/master/LICENSE) file.

---

## 🙌 Acknowledgments

- Special thanks to resources in knot theory and molecular biology that inspired the creation of this library.

---

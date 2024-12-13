<div align="center">
    <h3>Kafka-Spark-Cassandra-Expense-Tracker SpringBoot Web App</h3>
<br>
<br>

<p align="center">
    <img src="https://miro.medium.com/v2/resize:fit:1280/0*lrhD8e1zlemTCUvT.png" alt="Spring Boot Logo" width="200"/>
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8i4zPog-0j0JR_yZglxPhTPZXxN2iMTQ3Dw&s" alt="AWS S3 Logo" width="150"/>
    <img src="https://www.google.com/imgres?q=kafka&imgurl=https%3A%2F%2Fwww.mshowto.org%2Fimages%2Farticles%2F2017%2F02%2Fkafka-logo-600x390-1.webp&imgrefurl=https%3A%2F%2Fwww.mshowto.org%2Fapache-kafka-nedir-genel-bakis-bolum-1.html&docid=YPkvfLDia9SVsM&tbnid=iL8GN1vaGLzM7M&vet=12ahUKEwiZstCIvaKKAxVnA9sEHejMF9UQM3oECBYQAA..i&w=600&h=390&hcb=2&ved=2ahUKEwiZstCIvaKKAxVnA9sEHejMF9UQM3oECBYQAA" alt="AWS S3 Logo" width="150"/>
    <img src="https://www.google.com/imgres?q=spark&imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2Ff%2Ff3%2FApache_Spark_logo.svg&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FApache_Spark&docid=hiDEHrBZsj1BWM&tbnid=95Jm1xx4s_Y_yM&vet=12ahUKEwiE2rnivaKKAxUMVPEDHX_HD44QM3oECHwQAA..i&w=800&h=416&hcb=2&ved=2ahUKEwiE2rnivaKKAxUMVPEDHX_HD44QM3oECHwQAA" alt="AWS S3 Logo" width="150"/>
    <img src="https://www.google.com/imgres?q=cassandra&imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2Fthumb%2F5%2F5e%2FCassandra_logo.svg%2F1200px-Cassandra_logo.svg.png&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FApache_Cassandra&docid=xMhOF7ibPWEOJM&tbnid=iCeDbF5h58az7M&vet=12ahUKEwjcv-nwvaKKAxXWR_EDHYhfBXwQM3oECG4QAA..i&w=1200&h=806&hcb=2&ved=2ahUKEwjcv-nwvaKKAxXWR_EDHYhfBXwQM3oECG4QAA" alt="AWS S3 Logo" width="150"/>

</p>
<br>
<br>
    <p>A project that integrates Spring Boot, PostgreSQL, and AWS S3 Kafka Spark Cassandra to manage employee data</p>
    <br/>

</div>

<h2>📖 Table of Contents</h2>
<ol>
    <li><a href="#about-the-project">📘 About The Project</a></li>
    <li><a href="#getting-started">🚀 Getting Started</a>
        <ul>
            <li><a href="#prerequisites">📋 Prerequisites</a></li>
            <li><a href="#installation">⚙️ Installation</a></li>
            <li><a href="#usage">🛠️ Usage</a></li>
        </ul>
    </li>
    <li><a href="#dependencies">📦 Dependencies</a></li>
    <li><a href="#screenshots">Screenshots</a></li>
    <li><a href="#contributing">🤝 Contributing</a></li>
    <li><a href="#contact">📞 Contact</a></li>
</ol>

<h2 id="about-the-project">📘 About The Project</h2>
<p>Key Features:</p>
<ul>
    <li>🗄️ <strong>PostgreSQL Database Integration:</strong> Employee and department data are stored in PostgreSQL, with data imported from CSV files for easy initialization.</li>
    <li>🖼️ <strong>AWS S3 Image Storage:</strong> Employee images are stored in AWS S3 for secure and scalable image storage.</li>
    <li>📋 <strong>Web Interface:</strong> Displays employee details (name, manager name, salary, commission, department) with a JOIN operation, allowing for easy management and viewing.</li>
    <li> <strong>Data comes constantly from cassandra </strong></li>
</ul>
<hr>

<h2 id="screenshots">Screenshots</h2>
<div align="center">
</div>

<h2 id="getting-started">🚀 Getting Started</h2>
<p>To get a local copy up and running, follow these steps.</p>

<h3 id="prerequisites">📋 Prerequisites</h3>
<p>Ensure you have the following software installed:</p>
<ul>
    <li>Java 17+</li>
    <li>Maven</li>
    <li>apache-cassandra-3.11.10</li>
    <li>kafka_2.12-3.9.0</li>
    <li>spark-2.4.5-bin-hadoop2.7</li>
    <li>AWS CLI (for AWS S3 integration)</li>
    <li>PostgreSQL</li>
</ul>

<h3 id="installation">⚙️ Installation</h3>
<ol>
    <li>Clone the repository:
        <pre><code>git clone https://github.com/FatihArslan-cmd/AWS-S3-SPRINGBOOT-INTEGRATION.git</code></pre>
    </li>
    <li>Navigate to the project directory:
        <pre><code>cd demo</code></pre>
    </li>
    <li>Install dependencies:
        <pre><code>mvn clean install</code></pre>
    </li>
    <li>Run the project:
        <pre><code>mvn spring-boot:run</code></pre>
    </li>
</ol>

<h4>Set up AWS S3 Bucket:</h4>
<ol>
    <li>Create an S3 bucket and upload sample images from this link <a href="https://github.com/ozmen54/SWE307-2023/tree/main/Pro1/images">images</a>.</li>
    <li>Configure your AWS credentials using <code>aws configure</code>.</li>
</ol>

<h4>Set up PostgreSQL:</h4>
<ol>
    <li>Import employee and department data from the provided CSV files into PostgreSQL from <a href="https://github.com/ozmen54/SWE307-2023/tree/main/Pro1/data">data</a>.</li>
</ol>
<hr>
<h4>Set up Kafka Spark Cassandra:</h4>
<ol>
    <li>[Follow the link](https://github.com/FatihArslan-cmd/DataGenerator-Kafka-)
</li>
</ol>
<hr>
<h2>🔑 Configuration</h2>
<p>Add the following keys to your <code>application.properties</code> file:</p>

<pre><code>
aws.accessKeyId=""
aws.secretAccessKey=""
aws.region=""
aws.bucketName=""

spring.cassandra.contact-points=
spring.cassandra.port=
spring.cassandra.keyspace-name=
spring.cassandra.local-datacenter=
spring.cassandra.schema-action=none

spring.datasource.url=""
spring.datasource.username=""
spring.datasource.password=""
</code></pre>

<h2 id="usage">🛠️ Usage</h2>
<p>Once the project is running:</p>
<ul>
    <li>You gotto start kafka server spark submit cassandra server and data generator [Follow the link](https://github.com/FatihArslan-cmd/DataGenerator-Kafka-)</li>
    <li>Open your browser and navigate to <a href="http://localhost:8080">http://localhost:8080</a> to view the employee data</li>
</ul>
<hr>

<h2 id="dependencies">📦 Dependencies</h2>
<ul>
    <li>Java 17</li>
    <li>Spring Boot</li>
    <li>PostgreSQL</li>
    <li>AWS SDK for Java (for S3 integration)</li>
    <li>Maven (for build management)</li>
</ul>
<hr>

<h2 id="contributing">🤝 Contributing</h2>
<p>Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.</p>
<ol>
    <li>Fork the Project</li>
    <li>Create your Feature Branch (<code>git checkout -b feature/AmazingFeature</code>)</li>
    <li>Commit your Changes (<code>git commit -m 'Add some AmazingFeature'</code>)</li>
    <li>Push to the Branch (<code>git push origin feature/AmazingFeature</code>)</li>
    <li>Open a Pull Request</li>
</ol>
<hr>

<h2 id="contact">📞 Contact</h2>
<p>Fatih Arslan - Software Engineer</p>

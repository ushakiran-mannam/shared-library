#!/usr/bin/env groovy

def call(String artifact , String bucketName){
    withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: 'aws-local-keys', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
    
    sh "aws s3 cp $artifact s3://$bucketName"
    }
    
}
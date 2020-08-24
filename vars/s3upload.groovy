#!/usr/bin/env groovy

def call(String artifact , String bucketName){
    sh "aws s3 cp $artifact s3://$bucketName"
}
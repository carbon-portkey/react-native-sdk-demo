//
//  APKViewController.m
//  AelfPortkey
//
//  Created by wade-portkey on 09/13/2023.
//  Copyright (c) 2023 wade-portkey. All rights reserved.
//

#import "APKViewController.h"
#import <AelfPortkey/ARNSDKRootView.h>

@interface APKViewController ()

@end

@implementation APKViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
    [ARNSDKRootView testMethod];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
